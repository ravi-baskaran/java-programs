package multithreading;

public class RunnableMain {

	public static void main(String[] args) {
		
		RunnableDemo obj = new RunnableDemo();
		
		Thread t = new Thread(obj);
		t.start();
		
		for(int i=0; i<1000; i++) {
			System.out.println("from main class");
		}
		
		
		
	}

}
