package Basic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for finding factorial : ");
		int num = sc.nextInt();
		long fact = 1;
		if (num >= 0) {
			if (num == 0) {
				System.out.println("Factorial of " + num + " is : " + 1);
				sc.close();
				return;
			}
			while (num > 0) {
				fact *= num;
				num--;
			}
			System.out.println("Factorial of " + num + " is : " + fact);

		} else {
			System.out.println("Unable to find factorial of this number");
		}
		sc.close();
	}

}
