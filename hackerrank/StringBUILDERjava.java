package hackerrank;

import java.util.*;

public class StringBUILDERjava {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder newWord = new StringBuilder(A);
        newWord.reverse();
        if(A.equalsIgnoreCase(newWord.toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}





