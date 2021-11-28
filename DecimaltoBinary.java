// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        int bin = 0 ;
        int n ;
        int i =0;
        while(dec != 0){
        n = dec % 2;
        //System.out.println(n);
        bin = bin+(int)(n*Math.pow(10,i));
       // System.out.println(dec);   
        dec = dec/2;
        i++;
        }
       System.out.println(bin); 
    }
}
