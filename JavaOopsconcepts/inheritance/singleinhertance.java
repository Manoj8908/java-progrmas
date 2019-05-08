package inheritance;

 class parent1 {
	
	 static int i = 10;
	 
	  parent1() {
		 
		 System.out.println("value of i:"+i);
		 
	 }

}
 
  class child1 extends parent1 {

	 child1() {
		
		super();
		
		System.out.println("Child Class :"+i);
		
		
	}
}

public class singleinhertance {
	
	public static void main(String args[]) {
		
		child1 obj = new child1();
		
	}

}
