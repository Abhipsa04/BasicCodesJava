// "static void main" must be defined in a public class.
//Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int n = num;
        while(n!=0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        if(num % sum == 0){
            System.out.println("Harshad Number");
        }
        else
            System.out.println("Not a Harshad Number"); 
    }
   
}
