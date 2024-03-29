package Basic;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for finding fibonacci series : ");
		int num = sc.nextInt();
		int n1=0,n2=1,n3=2;
		
		if(num == 0) {
			System.out.println(0);
		}
		else if(num == 1){
			System.out.println(0+"  "+1);
		}
		else {
			System.out.print(0+"  "+1);
			for(int i=2; i<=num; i++) {
				n3 = n1+n2;
				n1 = n2;
				n2 = n3;
				System.out.print("  "+n3);
			}
		}
		sc.close();
	}

}
