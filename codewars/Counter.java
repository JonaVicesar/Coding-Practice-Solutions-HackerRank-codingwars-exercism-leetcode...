/*Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric 
 * digits that occur more than once in the input string. The input string can be assumed to contain only alphabets 
 * (both uppercase and lowercase) and numeric digits.
 * 
 * "abcde" -> 0 # no characters repeats more than once
	aabbcde" -> 2 # 'a' and 'b'
	"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
	"indivisibility" -> 1 # 'i' occurs six times
	"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
	"aA11" -> 2 # 'a' and '1'
	"ABBA" -> 2 # 'A' and 'B' each occur twice
 */

package codewars;

import java.util.HashMap;
import java.util.Map;

public class Counter {
	public static int duplicateCount(String text) {
		if(text == null || text.isEmpty()) {
			return 0;
		}
	    Map<Character, Integer> counter = new HashMap<>();
	    for(char character : text.toLowerCase().toCharArray()) {
	    	counter.put(character, counter.getOrDefault(character, 0) +1);
	    }
	    int repeats = 0;
	    for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > 1) {
                repeats++;
            }
	  }
	    return repeats;
	}
	
	public static void main(String [] args) {
		
	}
}
