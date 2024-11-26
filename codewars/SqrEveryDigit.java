/*Description:
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.

Happy Coding!
*/

package codewars;

public class SqrEveryDigit {
	public static int squareDigits(int n) {
		String nString = Integer.toString(n);
		int complete = 0, sqr, chartoInt;
		char[] intChar = nString.toCharArray();
		StringBuilder sqrToString = new StringBuilder();
		for(char number : intChar) {
			chartoInt = Character.getNumericValue(number);
			sqr = chartoInt * chartoInt;
			sqrToString.append(sqr);
			nString = sqrToString.toString();
			complete = Integer.parseInt(nString);
			
		}
		return complete;
	}
	
	public static void main(String []args) {
		System.out.println(SqrEveryDigit.squareDigits(123));
	}

}
