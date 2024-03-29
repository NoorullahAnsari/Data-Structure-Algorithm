package Basic;

import java.util.Scanner;

public class IfAndElse {

	public static void main(String[] args) {
		System.out.println("If and Else start: ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks to your Grade : ");
		int marks = sc.nextInt();
		if(marks>=90 && marks<=100) {
			System.out.println("Grade : A+");
		}
		else if(marks>=75 && marks<90) {
			System.out.println("Grade : A");
		}
		else if(marks>=60 && marks<75) {
			System.out.println("Grade : B");
		}
		else if(marks>=45 && marks<60) {
			System.out.println("Grade : C");
		}
		else {
			System.out.println("Grade : D");
		}
		sc.close();
	}

}
