import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FPDemo {
	
	public static void main(String[] args) {
		
		DemoFunctionalInterface d = (a,b) -> a+b;
		System.out.println(d.addition(5, 5));
		
		
		List<Integer> num = List.of(2,4,6,78,6,544,7);
		
		BinaryOperator<Integer> printAccumulator = Integer::sum;
		
		BinaryOperator<Integer> printAccumulator1 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer a, Integer b) {
				return a+b;
			}
			
		};
		
		int v = num.stream()
		.filter(n -> n%3 ==0)
        .map(n -> n*n)
        .reduce(0, printAccumulator1);
		 
		 System.out.println(v);
		
		
		
	}

}
