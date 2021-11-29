// "static void main" must be defined in a public class.
/*****
A n digit number is a plus perfect number if it is equal to the sum of its digits raised by nth power
***/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        int flag=0;
        int temp = num;
        while(temp!=0){
            temp=temp/10;
            count++;
        }// counting the number of digit of the number
        //System.out.println(count);
        int sum =0;
        temp = num;
        while(temp!=0){
            int dig = temp % 10 ;
            //int res =(int) Math.pow(temp,count);
            sum = (int)(sum + Math.pow(dig,count));// calculating sum of the digits raised to the power no of digits of the given nuber
           /* if(sum>=num){
                flag=1;
                break;
            }*/
                
            //System.out.println(sum);
            temp= temp/10;
        }
       /* if(flag==1)
           System.out.println("Not PlusPerfect"); 
        System.exit(0);*/
        if(num==sum)//checking if sum is same as the given number
            System.out.println("PlusPerfect");
        else
            System.out.println("Not PlusPerfect");
        
        
    }
}
