package exceptionHandling;

public class HandlingChildThrows extends ExceptionOverridingThrows {
	
	public void run() throws InterruptedException{System.out.println("Thread is running");//we should throw InterruptedException in child class also
	 //Since it is a Checked Exception
	
		Thread.sleep(10000);
	
	System.out.println("thread is in sleep");
	
	}/*we cannot declare checked exception in the child class 
	                                                             without declaring in parent class*/
	

	public static void main(String[] args) {
		HandlingChildThrows h=new HandlingChildThrows();
		try {
			h.run();
		} catch (InterruptedException e) {
			
			
			System.out.println(e.getMessage());
		}

	}

}
