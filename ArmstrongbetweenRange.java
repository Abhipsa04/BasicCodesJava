// "static void main" must be defined in a public class.
/*Armstrong number of three digits is the number whose sum of the cubes of its digits 
is equal to the given number or can say the number itself should be the result*/
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int st = sc.nextInt();
        int fi = sc.nextInt();
        for(int i = st ; i<= fi ; i++){
            int num = i;
            int sum = 0;
            while(num>0){
                int rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num/10;
            }
           if(sum == i)
               System.out.println(i);
            
        
        }

    }
}
