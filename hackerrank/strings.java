package hackerrank;
import java.util.*;

public class strings {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String A=sc.next();
        System.out.println("Enter a String: ");
        String B=sc.next();
        int longiA = A.length();
        int longB = B.length();
        int suma = longiA + longB;
        System.out.println(suma);
        /*if(A.compareTo(B) > 0){
            System.out.print("Yes");
        }
        else{
            System.out.println("No");
        }*/
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        String aCapi = A.substring(0, 1).toUpperCase() + A.substring(1);
        String bCapi = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.print(aCapi + " " + bCapi);
      
        
    }
}



