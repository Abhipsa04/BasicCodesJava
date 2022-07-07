import java.util.*;
public class Main
{   static void swap(int a , int b){
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap numbers are: x: "+a+" y: "+b);
    }
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Before swap numbers are: x: "+x+" y: "+y);
		swap(x,y);
		
		
	}
}
