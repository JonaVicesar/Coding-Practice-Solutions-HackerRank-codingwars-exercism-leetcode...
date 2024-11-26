/*Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
*/

package codewars;

import java.util.HashMap;
import java.util.Map;

public class OddTimes {
	public static int findIt(int[] a) {
		Map<Integer, Integer> oddTimes = new HashMap<>();
		int position = 0;
		int claveF = 0;
		for(Integer character : a) {
	    	oddTimes.put(character, oddTimes.getOrDefault(character, 0) +1);
	    }
		for(Integer key : oddTimes.keySet()) {
			int clave = key;
			int value = oddTimes.get(clave);
			if(value%2 != 0) {
				claveF = clave;
				break;
			}
		}
		return claveF;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int findInt2(int[] a) {
		int unique = 0;
		for(int i : a) {
			unique ^= i;  //usando el operador XOR, se aplica la propiedad A ^ A = 0
			System.out.println(unique);
		} 
		return unique;
		
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String [] args) {
		int[] abc = {2,2,2,3,3,1,1};
		System.out.println(OddTimes.findInt2(abc));
	}

}
