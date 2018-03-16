package throwpackage;

public class Custom {
	String s="kranthikumar";
	int a=s.length();
	public void result(){
		try {if(a>10){
		
				throw new ThrowCustomExceptions("out of characters");
			}
			else
				System.out.println("print name : "+s);
		}
		catch (ThrowCustomExceptions e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
						
		}}}
		
		
	
	


