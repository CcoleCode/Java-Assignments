
//Write a program that asks user for 2 integers and 
//print the divison of the 2 integers. 
//Handle ArithmeticException and 
//print its stacktrace. 
//Handle all other RuntimeException and 
//print its message. 
//Irrespective of whether an exception ocurred or not, print a "Thank you" message.



import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		
		int y;
		int x;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		x = input.nextInt();
		
		System.out.println("Enter a second number: ");
		y = input.nextInt();
		

		try { 
			System.out.println("The division of the two numbers is: " + Math.floorDiv(x, y));		
		} catch (ArithmeticException c) {
			c.printStackTrace();
		}
		catch (RuntimeException b) {
			System.out.println("Printing runtime exception");
			
		}
		finally {
			System.out.println("Thank you");
		}
	}

}
