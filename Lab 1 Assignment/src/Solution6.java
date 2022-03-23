import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

// Write a program to ask the user for states they have visited in the US. 
//Ignore case by converting their input to lower case. 
//Ignore duplicate inputs. 
//Order of input doesn't matter. 
//The program runs forever until the user types "done". 
//When the user types "done", display the unique list of states back to the user.

public class Solution6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> states = new ArrayList<String>();
		
		System.out.println("Enter the states you have visited one at a time.");
		
		do{
			System.out.println("State name:");
			input.nextLine();
		
		
		} while(input.nextLine() != "done"); {
			//System.out.println("State name: ");
			//input.nextLine();
			states.add(input.nextLine().toLowerCase());
		
			
		}
		
		if (input.nextLine() == "done") {
			System.out.println(states.size());
		}
			
		
		//for(int i = 0; i < states.size(); i++) {
			//System.out.println(states.get(i));
		//}
		
		
		//for(int i = 0; i < states.size(); i++) {
		//	System.out.println(states.get(i));
		
		//if (input.nextLine() == "done") {
		//	System.out.println(states.size());
		//}
		}
		
		//input.close();
	}

		