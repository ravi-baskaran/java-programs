package multithreading;

public class ThreadDemo extends Thread {
	
	@Override
	public void run() {
		
		for(int i=0; i<1000; i++) {
			System.out.println("from thread class");
		}
	}

}
