package Programs;

public class Palindrom {

	public static void main(String[] args) {
		int n = 1215;
		int sum=0;
		int r,temp;
		temp=n;
		
		while(n>0) {
			
			r = n%10;
			sum = sum*10+r;
			n = n/10;
		}
if (temp==sum) {
	System.out.println("Palindrom");
}
else
{
	System.out.println("Not palindrom");
}
	}

}
