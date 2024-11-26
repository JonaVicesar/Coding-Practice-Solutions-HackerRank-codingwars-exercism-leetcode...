/*
 * Given two integers a and b, which can be positive or negative, find the sum of all the integers 
 * between and including them and return it. If the two numbers are equal return a or b.
 * Note: a and b are not ordered!
 */

package codewars;

public class Sum_of_Numbers {
	public int GetSum(int a, int b){
		if(a != b) {
			int greater = (a > b)? a : b;
			int smallest = (a > b)? b : a;
			int sum = 0;
			int count = smallest;
			while(count <= greater) {
				sum = sum + count;
				count++;
			}
			
			return sum;
		}
		else {
			return a;
		}
		
	}
////////////////////////////////////////////////////////////////////////////////////
	
	public int getSum(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		if(a == b) {
			return a;
		}
		return ((max - min + 1)*(max + min))/2; //usando la formula de suma aritmetica de series
		
	}
	
	///////////////////////////////////////////////////////////////////////////////
	public static void main(String [] args) {
		Sum_of_Numbers ab = new Sum_of_Numbers();
		int sumab = ab.getSum(1, 5);
		System.out.print(sumab);
	}
}
