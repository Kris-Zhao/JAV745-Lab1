/**
 * This UserIntro class has been developed in order to print the name of an airline customer along with the city of arrival, according to 
 * different input combination. 
 * 
 * Question1 of Lab1. 
 * @author Yuhang Zhao, student number 150467199
 *
 */

public class UserIntro {
	/**
	 * This main method shall take in a String array called args, including the the first string parameter, UserName and, the second
	 * parameter integer parameter, the number encoding the city airport.
	 * According to the relationship between the city airport and the encoding number, print the words whose format is like 
	 * Hello UserName, Welcome to the city airport!
	 * If the relationship doesn't satisfy, it would output "Input error".
	 * 
	 * @param args - an array which represents elements on the command line. args[0] represents UserName, args[1] represents the
	 * number encoding the city airport.
	 * 
	 *  
	 */

	public static void main(String[] args) {
		
		if (args[1].equals("0")) {
			System.out.printf("Hello %s , Welcome to %s!", args[0], "Lester B. Pearson Airport");
		}
		else if (args[1].equals("1")) {
			System.out.printf("Hello %s , Welcome to %s!", args[0], "Billy Bishop Airport");
		}
		else if (args[1].equals("2")) {
			System.out.printf("Hello %s , Welcome to %s!", args[0], "John Munro Airport");
		}
		else if (args[1].equals("3")) {
			System.out.printf("Hello %s , Welcome to %s!", args[0], "Waterloo Airport");
		}	
		else {
			System.out.println("Input error");
		}
		// match the second entered value to the city airport
	}
}

/**
 * Question Answer:
 * If I type "java UserIntro Eden Burton", the output is "Input error" while I am running my code.
 * Why this happens is that Burton is regarded as the second value, but it doesn't belong to anyone of 
 * "0","1","2","3", so the output is "Input error" as I expect.
 * 
 */

 