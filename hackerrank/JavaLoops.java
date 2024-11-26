package hackerrank;

import java.util.*;

class JavaLoops{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();//variable para guardar el primer numero 
            int b = in.nextInt();//variable para guardar el segundo numero
            int n = in.nextInt();//variable para guardar la cantidad de veces que se 
            for(int j = 0; j < n; j++){
                a = a + b;
                System.out.print(a + " ");
                b = 2*b;
            }
            System.out.print("\n");
        }
        in.close();
    }
}
