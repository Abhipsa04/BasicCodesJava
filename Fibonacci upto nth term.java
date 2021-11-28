// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int a  = 0 ;
        int b = 1;
        int s;
       while(range>0){
            //for(int i=0;i<range;i++){
                //System.out.println(i + "Pass");
                System.out.println(a);
                 s = a+b;
               // System.out.println("a = "+a+ " "+"b ="+b);
                
                a=b;
                b=s;
                range--;
                //System.out.println()
                
            }
           
       }
           
        }
    
