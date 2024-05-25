package multithreading;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		ThreadDemo obj = new ThreadDemo();
		obj.start();
		
		for(int i=0; i<1000; i++) {
			System.out.println("from main class");
		}
		
	}

}
