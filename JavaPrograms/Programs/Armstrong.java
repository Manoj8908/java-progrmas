package Programs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		System.out.println("****Find the armstrong numbers****");
		System.out.println("Start the Range:");
		
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		
		System.out.println("Ending Range:");
		int high = sc.nextInt();
		
		for(int number = low + 1; number < high; ++number) {

            if (checkArmstrong(number))
                System.out.print(number + " ");
        }
    }

    public static boolean checkArmstrong(int num) {
        int digits = 0;
        int result = 0;
        int originalNumber = num;

        // number of digits calculation
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++digits;
        }

        originalNumber = num;

        // result contains sum of nth power of its digits
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        if (result == num)
            return true;

        return false;
    }
}