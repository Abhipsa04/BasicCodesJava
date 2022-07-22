import java.util.*;
public class Main
{
    static void fibTerm(int n){
        int a=0;
        int b = 1;
        int s;
        while(n >0){
            System.out.print(a+" ");
            s=a+b;
            a=b;
            b=s;
            n--;
        }
    }
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i = 1 ; i<=row ; i++){
		    for(int j=1; j<=row-i;j++){
		        System.out.print(" ");
		    }
		    fibTerm(i);
		    System.out.println();
		}
	}
}
