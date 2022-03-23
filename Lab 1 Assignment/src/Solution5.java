import java.util.Scanner;
import java.math.*;

//Write a program to ask the user for a decimal number, and 
//print the floor, ceil, round of that number



public class Solution5 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal number: ");
		
		double userInput = input.nextDouble();

		System.out.println("The ceil value of the number is " + Math.ceil(userInput));
		System.out.println("The floor value of the number is " + Math.floor(userInput));
		System.out.println("The number rounded to its nearest integer is " + Math.round(userInput));
	
	
input.close();
	}
}