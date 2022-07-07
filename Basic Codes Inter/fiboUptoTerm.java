import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("How many Terms U want to print: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a  = 0 ;
        int b = 1;
        int s;
       while(n>0){
            
                System.out.print(a+" ");
                s = a+b;
                a=b;
                b=s;
                n--;
            }
           
       }
           
        }
