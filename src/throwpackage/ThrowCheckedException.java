package throwpackage;

public class ThrowCheckedException {
public void run(){

	try {
		System.out.println("thread is runnable");
		Thread.sleep(1000);
		System.out.println("thread is in sleep");	
		throw new InterruptedException("thread is in sleep");
	} catch (InterruptedException e) {
	
		
		System.out.println("thread is running");
	}
	
		
		
	}
	
}

