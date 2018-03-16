package exceptionHandling;

public class TestPropagation {
	void m(){
		int i=50/0;
	}
	void n(){
		m();
	}
void p(){
	try{
		n();
	}
	catch(Exception e){System.out.println("Exception is handled");}
}
	public static void main(String[] args) {
		TestPropagation obj=new TestPropagation();
		obj.p();
		System.out.println("Normal Flow");
		
	}

}
