import java.util.Scanner;
import java.io.*;

public class predictionError{
     public static double predictionError(String state,double prob){
         int len = state.length();
         int n = Integer.parseInt(state, 2);
         int count=0;
         for(count=0; n>0;++count){
             n &= n - 1;
         }
         double inProb = ((double)count)/len;
         return Math.abs(inProb-prob);

     }

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        double d = scan.nextDouble();

        System.out.println( predictionError(s,d));

     }
}
