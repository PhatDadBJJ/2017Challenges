import java.util.*;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		Scanner scInput = new Scanner(System.in);
		
		//String stWord; Removed declaration and placed 'String' before stWord on line 12 to make smaller.		
		System.out.println("Type in a word: ");
		String stWord = scInput.next();		
		
		System.out.println("The word you entered, " + stWord + ", written backwards is " 
		+ new StringBuilder(stWord).reverse().toString() + ".");
		
	}
}
