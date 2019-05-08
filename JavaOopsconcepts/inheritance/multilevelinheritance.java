package inheritance;

class parent {
	
	static int i = 20;
	 
	  parent() {
		 
		 System.out.println("value of i:"+i);
		 
	 }
}

class child2 extends parent{
	
	 child2() {
		
		super();
		System.out.println("Child1 value :"+i);
	}
}

class child3 extends child2{
	
	 child3() {
		
		super();
		System.out.println("Child1 value :"+i);
	}
}


public class multilevelinheritance {
	
public static void main(String args[]) {
		
		child3 obj = new child3();

}
}
