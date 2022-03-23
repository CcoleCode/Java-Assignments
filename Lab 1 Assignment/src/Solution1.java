import java.util.Scanner;

//Write a program to reverse the order of words in a sentence

public class Solution1 {

	public static void main(String[] args) {
		
		String reverse = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence and the words will be printed in reverse order: ");
		
		String userInput = input.nextLine();
		
		
		
		int length = userInput.length();
		
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + userInput.charAt(i);
		
		System.out.println("Sentence reversed: " + reverse);
		
		

	}

}
