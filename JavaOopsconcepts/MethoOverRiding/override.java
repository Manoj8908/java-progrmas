package MethoOverRiding;
//having same method name and different argument
 class parent {
	
	void m1(){
		
		System.out.println("Parent");
	}
	}
class child extends parent{
	
	void m1() {
		
		System.out.println("Child");
	}
}
public class override{
	public static void main(String args[]) {
		
		child obj = new child();
		obj.m1();
	}
	
}