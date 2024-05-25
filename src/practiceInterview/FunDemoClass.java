package practiceInterview;

public class FunDemoClass {

	public static void main(String[] args) {


		FunDemoInt gre = (a,b) -> a>b ? a:b;
		System.out.println(gre.greatestNum(30, 22));

	}

}
