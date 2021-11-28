// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 1;
        if(num1==0 || num2 == 0)
            System.out.println("Wrong Input");
        if(num1==num2){
             gcd = num1;
            System.out.println(gcd);
            return;
        }
           
        
        for(int i = 1 ; i<=num1 && i<=num2 ; i++)
        {
            if(num1 % i == 0 && num2 % i ==0)
                gcd = i;
                
        }
       System.out.println(gcd); 
    }
}
