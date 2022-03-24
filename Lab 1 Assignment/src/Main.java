import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userChoice;
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> PlayList = new ArrayList<String>();

		PlayList.add("Bootylicious");
		PlayList.add("Rise");
		PlayList.add("Jumping");
		PlayList.add("Stomp");
		
		System.out.println(PlayList);
		
		System.out.println("Which song would you like to play?");
		userChoice = input.nextLine();
		
		
		if (userChoice.contains((CharSequence) PlayList)){
			System.out.println(userChoice);
		}
		//PlayList.findSong();
		
	input.close();	
	}

}
