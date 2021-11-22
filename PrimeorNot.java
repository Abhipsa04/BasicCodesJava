


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int flag=0;
        if(num==1){
            System.out.println("Not a Prime");
           System.exit(0);
        }
        else if (num==2){
            System.out.println("Prime");
            System.exit(0);
        }
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                   flag=1;
                   break;
                }
                else
                    flag=0;
            }
        }
        if(flag==0){
            System.out.println("Prime");
            
        }
        else
            System.out.println("Not Prime");
    }
}
