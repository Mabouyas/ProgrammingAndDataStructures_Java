package InputProcessOutput;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		final double PI = 3.14159;
		//Create a Scanner Object!
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter the radius!
		System.out.println("Enter the radius:");
		double radius = input.nextDouble();
		//Compute the area!
		double area = radius * radius * PI;
		//Display result!
		System.out.println("The area for the circle of radius :" + radius + " is " + area);
	}
}
