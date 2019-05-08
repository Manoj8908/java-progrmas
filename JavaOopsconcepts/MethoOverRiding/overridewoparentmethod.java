package MethoOverRiding;

class parent1 {
	
	void m1(){
		
		
	}
	}
class child1 extends parent1{
	
	void m1() {
		
		System.out.println("Child1");
	}
}

public class overridewoparentmethod {

	public static void main(String[] args) {
		
		child obj = new child();
		obj.m1();
	}

}
