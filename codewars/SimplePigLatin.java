/**Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

Examples
pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
pigIt('Hello world !');     // elloHay orldway !
 * 
 */
package codewars;

public class SimplePigLatin {
	public static String pigIt(String str) {
		
		//(\\w) captured the first character
		//(\\w*) captured the rest of the character in the word
		// '*' means "zero or more of the previous thing"
		//$1 first thing captured, $2 second thing captured
		//whitespaces are just skipped
		return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
	}

	public static void main(String [] args) {
		System.out.println(SimplePigLatin.pigIt("Jona Vicesar Rafael Vicesar Gooo	"));
	}
}
