package exceptionHandling;

public class ExceptionOverridingThrows {
	public void run() throws InterruptedException{
		System.out.println("thread is ready to run");
		Thread.sleep(1000);
	System.out.println("thread is in sleep");
	} 
	

}
