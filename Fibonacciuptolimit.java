	// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
				
		int lim = sc.nextInt();
		if(lim > 0)
		{
			int y = 0, z = 1, s;
			
			System.out.print("Fibonacci Series : "+y+"  "+z+"  ");
			
			while(z <= lim)
			{
				s=y+z;
				y=z;
				z=s;

				if(z <= lim)
					System.out.print(z+"  ");
			}
		}
		else
			System.out.print("Wrong Input");
    }
}
