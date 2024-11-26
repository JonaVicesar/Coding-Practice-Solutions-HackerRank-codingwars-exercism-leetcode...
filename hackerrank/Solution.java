package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		scanner.close();
		boolean weirdCondition1 = false;
		boolean notWeirdcondition1 = false;
		
		if(N%2 == 0 && N > 6 && N < 20 && N%2 == 0){
			weirdCondition1 = true;
		}
		if(N%2 == 0 && N > 20){
			notWeirdcondition1 = true;
		}
		if(N%2 != 0 && weirdCondition1 ){
			System.out.println("Weird");
		}
		if(N%2 == 0 && notWeirdcondition1){
			System.out.println("Not weird");
		}

	}


}
