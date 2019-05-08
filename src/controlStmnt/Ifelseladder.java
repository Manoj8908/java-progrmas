package controlStmnt;

public class Ifelseladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =  95;
		
		if (number<30) {
			System.out.println("Fail");
		}
		else if (number>=30 && number<=40) {
			System.out.println("D Grade");
		}
		else if (number>=40 && number<=60) {
			System.out.println("C Grade");
		}
		else if (number>=60 && number<=79) {
			System.out.println("B Grade");
		}
		else if (number>=79 && number<=90) {
			System.out.println("A Grade");
		}
		else if (number>=90 && number<=100) {
			System.out.println("O Grade");
		}

	}

}
