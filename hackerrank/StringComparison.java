/*Given a string, s, and an integer, k, complete the function so that it finds the
 lexicographically smallest and largest substrings of length .

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
*/
package hackerrank;

import java.util.Scanner;

public class StringComparison {
    public static String getSmallestAndLargest(String s, int k) {
    	String currentString = s.substring(0, k);
    	String smallest = currentString;
        String largest = currentString;
        for(int i = 1; i <= s.length() - k; i++) {// minus k
        	currentString = s.substring(i, k + i);
        	if(currentString.compareTo(largest) > 0) {
        		largest = currentString;
        	}
        	if(currentString.compareTo(smallest) < 0){
        		smallest = currentString;
        	}
        }
        return currentString;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scan.next();
        System.out.print("Enter a integer: ");
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }

}

