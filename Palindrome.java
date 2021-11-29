// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int n = num;
        while (num!=0)
        {
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        }
        if( n == rev)
            System.out.println("Palindrome");
        else
           System.out.println(" Not Palindrome"); 
    }
}
