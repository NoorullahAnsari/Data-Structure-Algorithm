package Basic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not : ");
		int num = sc.nextInt();
		int temp = num;
		if(temp>1) {
			for(int i=2; i<Math.sqrt(num); i++) {
				if(temp%i == 0) {
					System.out.println("Number is not prime");
					sc.close();
					return;
				}
			}
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		sc.close();
	}

}
