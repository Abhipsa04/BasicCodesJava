import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the Number from where to start: ");
        Scanner sc = new Scanner(System.in);
				
		int num = sc.nextInt();
		System.out.println("Upto how many terms: ");
		int term = sc.nextInt();
		if(term > 0)
		{
			int y = 0, z = 1, s;
			
		   //	System.out.print("Fibonacci Series : "+y+"  "+z+"  ");
			
			while(term >=0)// if we take 5 then next 5 terms will be printed
			// if we remove the equal and take 5 then next 4 terms will be printed
			// remove the equal and see the difference
			{   
			    if(y >= num)
				{
					System.out.print(y+"  ");
			        term--;
				}
				s=y+z;
				y=z;
				z=s;


			}
		}
		else
			System.out.print("Wrong Input");
    }
}
