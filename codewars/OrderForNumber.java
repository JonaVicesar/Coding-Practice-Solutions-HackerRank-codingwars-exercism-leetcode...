/*Your task is to sort a given string. Each word in the string will contain a single number. 
 * This number is the position the word should have in the result.
Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
 */

package codewars;

public class OrderForNumber {
	public static String order(String words) {
		if(words.isEmpty()) {
			return "";
		}
	    String[] wordsArray = words.split(" ");
	    String[] orderWords = new String[wordsArray.length];
	    
	    for(String word : wordsArray ) {
	    	for(char character : word.toCharArray()) {
	    		if(Character.isDigit(character)) {
	    			orderWords[character - '1'] = word;
	    		}
	    	}
	    }
	    StringBuilder sortedString = new StringBuilder();
	    for(String orderWord : orderWords) {
	    	sortedString.append(orderWord).append(" ");
	    }
	    return sortedString.toString().trim();
	  }
	
	
	public static void main(String [] args) {
		String blabla = "Co2mo 3stas Jon1";
		System.out.println(OrderForNumber.order(blabla));
	}
}
