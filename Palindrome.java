import java.util.*;

/**************************************************
 
 *File Name: Palindrome
  *Purpose:
  *Programmer: Marcos Tapia
  *Last Updated Date: 10/26/2017
  *************************************************/

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Display what the program does
		System.out.println("This program test whether a string is palindrome or not.");
		
		//Variables
		String original = "";
		String reverse = "";
		
		//create Scanner Object
		Scanner in = new Scanner(System.in);
		
		// creates a Stack Object
		ArrayStack<Character> stack = new ArrayStack<>();
		
		//Prompt the user to enter a String
		System.out.println("Enter a word, a sentence or a phrase: ");
		original = in.nextLine();
		
		//new Sring remove spaces from string and makes it lowercase
		String newString = original.toLowerCase().replaceAll("\\s","");
		
		//push characters into Stack
		for(int i = 0; i < newString.length(); i++) {
			stack.push(newString.charAt(i));
		}
		
		
		//pop characters reverse into String reverse
		while(!stack.isEmpty()) {
			reverse = reverse + stack.pop();
		}
			
		//check if is a palindrome
		if(newString.equals(reverse)) 
			System.out.println("The String is a palindrome.");
		else 
			System.out.println("The String is not a palindrome.");
			
		

		
	}

}