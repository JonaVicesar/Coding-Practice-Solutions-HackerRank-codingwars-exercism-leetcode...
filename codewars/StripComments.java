/*
 * Complete the solution so that it strips all text that follows any of a set of comment markers passed in. 
 * Any whitespace at the end of the line should also be stripped out.
 */
package codewars;

public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
		String regex = commentSymbols.toString();
		
		
		return text.replaceAll(regex, "$2");
		
	}
	
	public static void main(String []args) {
		String[] symbols = {"#", "!"};
		System.out.println(StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", symbols));
	}
}