// Java program to reverse
// an integer recursively
import java.util.*;
class Main {
   
    // Recursive function to print
    // the number in reversed form
    public static void Reverse(int num)
    {
 
        // base condition to end recursive calls
        if (num < 10) {
            System.out.println(num);
            return;
        }
 
        else {
 
            // print the unit digit of the given number
            System.out.print(num % 10);
 
            // calling function for remaining number other
            // than unit digit
            Reverse(num / 10);
        }
    }
 
    // driver code
    public static void main(String args[])
    {
        // number to be reversed
        System.out.println("Enter the number to be reversed: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
 
        System.out.print("Reversed Number: ");
 
        // calling recursive function
        // to print the number in
        // reversed form
        Reverse(num);
    }
}
