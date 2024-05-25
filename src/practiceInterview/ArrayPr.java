package practiceInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayPr {

	public static void main(String[] args) {

		int[] arr = { 12, 15, -19, 17, -9, 14, -4, 7 };
		int[] newA = new int[arr.length];
		
	//	rearrange(arr, newA);
		
		//java 8
		
		List<Integer> n1 = Arrays.stream(arr).boxed().filter(e -> e < 0).collect(Collectors.toList());
		
		List<Integer> ans = Arrays.stream(arr).boxed().filter(e -> e>0).collect(Collectors.toCollection(()-> n1));
		System.out.println(ans);
		

	}

	static void rearrange(int[] arr, int[] newArr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		
		for(int i =0; i<arr.length; i++) {
			if (arr[i] > 0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		
		for (int i : newArr) {
			System.out.println(i);
		}

	}

}
