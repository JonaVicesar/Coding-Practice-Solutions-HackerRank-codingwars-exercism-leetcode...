package hackerrank;

import java.util.Scanner;

public class bubbleSort {
	
	public static int[] Bubble_sort(int[] list) {
		int longitud = list.length;
		for(int j = 0; j < (longitud - 1); j++) {
			for(int i = 0; i < (longitud - 1); i++) {
				int temp = list[i + 1];
				if(list[i] > list[i + 1]) {
					list[i + 1] = list[i];
					list[i] = temp;
				}
			}
		}
		return list;
	}
	
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int n[] = new int[5];
		for(int k = 0; k < 5; k++) {
			System.out.print("enter a number: ");
			n[k] = input.nextInt();
		}
		int[] new_kc = Bubble_sort(n);
		for(int i = 0; i < 5; i++) {
			System.out.print(new_kc[i] + " - ");
		}
	}
	
}
