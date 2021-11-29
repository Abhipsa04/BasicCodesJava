// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int year = sc.nextInt();
		//condition for checking year entered by user is a leap year or not
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                        System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
    }
}
