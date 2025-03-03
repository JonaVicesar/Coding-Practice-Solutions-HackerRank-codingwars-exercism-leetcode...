
/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four 
of the five integers. Then print the respective minimum and maximum values as a single line of two 
space-separated long integers.*/

package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {

	public static int miniMaxSum(List<Integer> arr) {
		
		return ((arr.getFirst() +  arr.getLast())*arr.size())/2;

	}
	
	public static void main(String []args) {
		List<Integer> num = new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		
		System.out.println(MiniMaxSum.miniMaxSum(num));
		
	}
}
