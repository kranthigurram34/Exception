package throwsPackage;

public class Testcustom {

	public static void main(String[] args)  {
		ThrowsCustomException c=new ThrowsCustomException();
		
			try {
				c.call(1, 1 );
			} catch (CustomException e) {
				System.out.println(e.getMessage());
				
							}
		
	}

}
