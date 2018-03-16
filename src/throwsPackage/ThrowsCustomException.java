package throwsPackage;

public class ThrowsCustomException{
	public void call(int a,int b)  throws CustomException{
		if(a!=b){
			throw new CustomException("not valid");
		}
		else{System.out.println("Numbers are Equal");}
		}

		
	}

