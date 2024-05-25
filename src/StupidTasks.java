
public class StupidTasks {
	
	public static void main(String[] args) {
		
		
		//Print *
		int n = 5;
		
		for(int i =0; i<n; i++) {
			
			for(int j =0; j<=i; j++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
		//find even or odd without modulus
		
		int quotient = n/2;
		
		if(quotient*2 == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	
	}

}
