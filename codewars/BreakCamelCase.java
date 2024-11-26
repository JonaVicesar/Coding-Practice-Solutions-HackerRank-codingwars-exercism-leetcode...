/*Description:
Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
*/

package codewars;

public class BreakCamelCase {
	
	/**
	 * First Solution
	 */
	public static String camelCase(String input) {
		StringBuilder newString = new StringBuilder();
		for(char i : input.toCharArray()) {
			if(Character.isUpperCase(i)) {
				newString.append(" ");
			}
			newString.append(i);
		}
		
		return newString.toString();
	}
	 
	/**
	 * Second Solution
	 */
	 
	public static String camelCase2(String input) {
	    return input.replaceAll("([A-Z])", " $1");
	  }
	
}
