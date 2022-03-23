import java.util.Scanner;

// Write a program to ask the user to enter a year and tell them if it's a leap year or not


public class Solution2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		
		int number = input.nextInt();
		
		if ((number% 4 != 100) || (number% 400 == 0)){
			 System.out.print("The year you entered is a leap year");
			
		} else {
			System.out.println("The year you entered is not a leap year");
		}

	}

}
