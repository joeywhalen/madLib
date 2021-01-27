package madLib;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ageLimit = 18;
		Scanner userInput = new Scanner(System.in);
		System.out.println("How old are you?");
		String inputAge = userInput.nextLine();
		int age = Integer.parseInt(inputAge);
		if (age < ageLimit) {
			System.out.println("You are too young!  Sorry\n");
			userInput.close();
			System.exit(0);
		}	else {
		
			System.out.println("Enter a name:");
			String nameOne = userInput.nextLine();
			
			System.out.println("Enter an adverb:");
			String adverb = userInput.nextLine();
			
			System.out.println("Enter an adjective:");
			String adjective = userInput.nextLine();
			
			System.out.println("Enter a noun:");
			String nounOne = userInput.nextLine();
			
			System.out.println("Enter a place:");
			String place = userInput.nextLine();
			
			System.out.println("Enter a number:");
			String numb = userInput.nextLine();
			
			System.out.println("Enter your name:");
			String nameTwo = userInput.nextLine();
			
			userInput.close();
			System.out.println("Here's the mad-lib");
			System.out.printf("Dear %s,\n", nameOne );
			System.out.printf("You are %s %s and I want to be your %s!\n", adverb, adjective, nounOne);
			System.out.printf("I want to go to the %s with you in %s days.\n", place, numb);
			System.out.printf("Sincerely, \n%s\n", nameTwo);
			
			System.exit(0);
			}
	}
}
