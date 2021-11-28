// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int dec = 0 ;
        int n ;
        int i =0;
        while(bin != 0){
        n = bin % 10;
        //System.out.println(n);
        dec = dec+(int)(n*Math.pow(2,i));
       // System.out.println(dec);   
        bin = bin/10;
        i++;
        }
       System.out.println(dec); 
    }
}
