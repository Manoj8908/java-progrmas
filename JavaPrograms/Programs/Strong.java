package Programs;

public class Strong {

	public static void main(String[] args) {
		
		int i,r,Sum=0,f,n;
		n = 145;
		int temp = n;
		
		while(n!=0) {
			
			r = n%10;
			f =1;
			for(i=1;i<=r;i++) {
				
				f = f*i;
			}
			Sum = Sum+f;
			n = n/10;
		}
		if(temp==Sum) {
			System.out.println("Strong");
			}
		else {
			System.out.println("Not strong");
		}
	}

}
