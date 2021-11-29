// "static void main" must be defined in a public class.
/* Max and Min of 3 numbers Using Ternary operator*/
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int Max = (n1>=n2)?((n1>=n3)?n1:n3):((n2>=n3)?n2:n3);
        int Min = (n1<=n2)?((n1<=n3)?n1:n3):((n2<=n3)?n2:n3);
        System.out.println("Max = " + Max);
        System.out.println("Min = " + Min);
        


    }
}
