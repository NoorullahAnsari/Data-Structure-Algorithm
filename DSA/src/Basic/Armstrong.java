package Basic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for check Armstrong or not : ");
		int num = sc.nextInt();
		int temp=num, total=0, digits=0, rem=0;
		while(temp>0) {
			digits++;
			temp/=10;
		}
		temp=num;
		while(temp>0) {
			rem = temp%10;
			total = total + (int)Math.pow(rem, digits);
			temp/=10;
		}
		if(total == num) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		sc.close();
	}

}
