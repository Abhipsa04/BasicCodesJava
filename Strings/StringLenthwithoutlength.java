// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();// reads untill space
        int length = 0;
        for( char c : str.toCharArray()){
            length++;
        }
        System.out.println(length);
    }
}
