
package hackerrank;

import java.util.Scanner;

public class stringsplitttt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()){
            System.out.print(0);
            return;
        }
        String s = scan.nextLine();
        scan.close();
        
        String[] listS =  s.trim().split("[ !,?._'@]+");
    
        if(s.trim().equals(0)){
            System.out.print(0);
            return;
        }
        
        int contador = listS.length;
        System.out.println(contador);
        for(String word : listS){
             System.out.println(word);
         }
    }
}
