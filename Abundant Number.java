// "static void main" must be defined in a public class.
/*An abundant number is a number for which the sum of its proper factors is greater than the number itself. For better understanding lets consider an example so that we can easily understand that exactly what is an abundant number.

Abundant number is also known as Excessive number. */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<num;i++){
            if(num % i == 0){
                sum = sum + i;
            }
        }
        if ( sum > num){
            System.out.println("Abundant Number"+" Abundance is "+(sum-num));
        }
        else 
            System.out.println(" Not an Abundant Number ");

    }
}
