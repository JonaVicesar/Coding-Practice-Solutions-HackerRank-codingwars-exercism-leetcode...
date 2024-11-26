package hackerrank;

import java.util.Scanner;

public class LoopsII {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a query:");
        int t=in.nextInt();
        System.out.println("Enter a number:");
		int a = in.nextInt();
		System.out.println("Enter a number:");
		int b = in.nextInt();
		System.out.println("Enter a number:");
		int n = in.nextInt();
		for(int j = 0; j < n; j++){
		    a = a + b;
		    System.out.print(a + " ");
		    b = 2*b;
		}
		System.out.print("\n");
        in.close();
    }

}

