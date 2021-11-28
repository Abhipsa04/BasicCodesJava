// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int LCM =0;
    int M = (n1>n2)?n1:n2;
    int N = (n1<n2)?n1:n2;
    for(int i=M;i<=M*N;){
         //System.out.println(i);
         //System.out.println(N);
        if(i%N==0){
            LCM = i;
            System.out.println(LCM);
            return;
        }
        i=i+M;
    }
    }
}
/**
//Java program to find LCM of two numbers
import java.util.Scanner;
public class lcm
{
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input from the user		
		System.out.print("Enter the first number : ");		
		int num1 = sc.nextInt();
		//input from the user
		System.out.print("Enter the second number : ");		
		int num2 = sc.nextInt();
		//logic for finding lcm of both numbers
                int i;
		int a =(num1 > num2)? num1 : num2;
		for(i = a ; i <= num1*num2 ; i=i+a)
		{
			if(i % num1 == 0 && i % num2 == 0)
				break;
		}
		//printing result
		System.out.println("LCM of "+num1+" and "+num2+" is : "+i);
									
	}
}**/
