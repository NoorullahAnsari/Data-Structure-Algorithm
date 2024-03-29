package Basic;

import java.util.Random;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		System.out.println("Loops Start : ");
		Scanner sc = new Scanner(System.in);

		// for loop
		System.out.println("Table 1 to 20 : ");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 20; j++) {
				int c = i * j;
				System.out.print(c + "	");
			}
			System.out.println();
		}

		// while loop example
		System.out.println("Easily Find Factorial here ");
		System.out.println("Enter a  number for finding factorial : ");
		int num = sc.nextInt();
		int temp = num;
		if (temp >= 0) {
			long fact = 1;
			while (temp > 0) {
				fact = fact * temp;
				temp--;
			}
			System.out.println("Factorial of " + num + " is : " + fact);
		} else {
			System.out.println("You can find factorial of this number");
		}

		// Do-while example

		Random random = new Random();
		int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
		int guess;
		int attempts = 0;
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I have selected a secret number between 1 and 100.");
		do {
			System.out.print("Guess the number: ");
			guess = sc.nextInt();
			attempts++;
			if (guess < secretNumber) {
				System.out.println("Too low! Try again.");
			} else if (guess > secretNumber) {
				System.out.println("Too high! Try again.");
			} else {
				System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in "
						+ attempts + " attempts.");
			}
		} while (guess != secretNumber);

		
		//For-each loop 
		
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int n : array) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Maximum value in the array: " + max);
        
        
		sc.close();
	}

}
