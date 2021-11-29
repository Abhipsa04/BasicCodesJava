// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dig = sc.nextInt();
        int count = 0;
        while(num !=0)
        {
            int rem = num % 10;
            if(rem == dig )
                count++;
            num = num/10;
                
        }
        System.out.println(count);
        
    }
}
