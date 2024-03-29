package Basic;

import java.util.Scanner;

public class InputAndOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// String input and output
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Your name is : " + name);

		// Integer input and output
		System.out.println("Enter you age : ");
		int age = sc.nextInt();
		System.out.println("Your age is : " + age);

		// Long input and output
		System.out.println("Enter Speed of light : ");
		long speed = sc.nextLong();
		System.out.println("The Speed of light is : " + speed);

		// boolean Inout/Output
		System.out.println("Are you male is this true or false : ");
		boolean isMale = sc.nextBoolean();
		if (isMale)
			System.out.println("Ok You are male");
		else
			System.out.println("Ok You are not male");

		// character Input/output
		System.out.println("Do you want to continue : Y or N");
		char ch = sc.next().charAt(0);
		System.out.println("Your given input is : " + ch);

		// double input and output
		System.out.println("Enter value of Pie : ");
		double pie = sc.nextDouble();
		System.out.println("The value of Pie is : " + pie);

		sc.close();
	}

}
