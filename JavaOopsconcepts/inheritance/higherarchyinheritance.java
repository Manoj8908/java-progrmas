package inheritance;

class parents {
	
	static int i = 300;
	 
	  parents() {
		 
		 System.out.println("value of i:"+i);
		 
	 }
}

class child4 extends parent{
	
	 child4() {
		
		super();
		System.out.println("Child4 value :"+i);
	}
}

class child5 extends parent{
	
	 child5() {
		
		super();
		System.out.println("Child5 value :"+i);
	}
}




public class higherarchyinheritance {

	public static void main(String[] args) {
		 
		child4 obj = new child4();
		child5 obj1 = new child5();


	}

}
