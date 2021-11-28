// "static void main" must be defined in a public class.
//Automorphic number is a number whose square ends in the same digits as the number itself. 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long n = (long)num;
        int flag = 0; // setting flag to 0 if condition satis fies it will not be changed
       long  sq = n*n;// taken long for bigger numbers eg 890625
        System.out.println("Number is "+n);
        System.out.println("Square is "+sq);
        
        while(num != 0)
        {
            long  sq_end = sq %10;// last digit of square
           long  num_end = num % 10;//last digit of number
            if(num_end == sq_end){
                num = num/10;// moving on to leftover digits
                sq = sq /10;//// moving on to leftover digits
                continue;//continue the loop to rsume checking
            }
            else{
                flag = 1; // if it does not match set flag to 1
                break;//discontinue loop
            }
        }
        if(flag == 0 ){
            System.out.println("Automorphic Number");
        }
        else
           System.out.println(" Not an Automorphic Number"); 

        
    }
}
