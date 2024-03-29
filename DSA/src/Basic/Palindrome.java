package Basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter a number to check palindrome or not : ");
		int num = sc.nextInt();
		
		int temp =num, rem=0, total=0;
		while(temp>0) {
			rem = temp%10;
			total = 10*total+rem;
			temp /= 10;
		}
		if(num == total) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}
}
