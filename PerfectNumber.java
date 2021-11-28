// "static void main" must be defined in a public class.
//Perfect number is a number whose sum of factors is equal to the given number. 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i<num ; i++){
            if(num % i == 0){
                sum = sum +i;
            }
        }
        if(sum == num)
            System.out.println("Perfect Number");
        else
           System.out.println(" Not Perfect Number"); 

        
        
    }
}
