// "static void main" must be defined in a public class.
//Here, in this section we will discuss the Java program to check whether two numbers are friendly pair or not. Friendly pair or Amicable numbers are two different numbers related in a way such that the sum of the proper divisors of each is equal to the other number
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1; i<num1;i++){
            if(num1 % i == 0){
                sum1 = sum1 + i;
            }
        }
        for(int j=1; j<num2;j++){
            if(num2 % j == 0){
                sum2 = sum2 + j;
            }
        }
        if(sum1 == num2 && sum2 == num1){
            System.out.println("Friendly Pair");
        }
        else
            System.out.println("Not Friendly Pair");
        
        
    }
}
