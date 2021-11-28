// "static void main" must be defined in a public class.
//Strong Number is the number whose sum of factorial of the digits in any number is equal to the given number. 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1;
        int sum =0;
        int n = num;
        while(n!=0){
             fact = 1;
            /* in every loop fact should be set to 1 again or it will take previous iteration value that will cause error */
            int r = n%10;
            for(int i =1 ; i<=r ; i++){
                fact = fact * i;
            }
            sum = sum + fact;
            n = n/10;
        }
        if(sum == num ){
            System.out.println("Strong Number");
        }
        else
            System.out.println("Not a Strong Number"); 
        
        
    }
}
