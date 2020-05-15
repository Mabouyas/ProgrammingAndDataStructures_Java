package InputProcessOutput;

import java.util.Scanner;

public class ComputeAverage {
	public static void main(String[] args) {
		//Create a Scanner Object!
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter 3 numbers!
		System.out.println("Enter three numbers:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		//Compute average!
		int average = (number1 + number2 + number3) / 3;
		
		//Display result!
		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is: " + average);
	}
}
