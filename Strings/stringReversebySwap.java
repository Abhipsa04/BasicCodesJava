
// Java program to Reverse a String using swapping
// of variables
import java.lang.*;
import java.io.*;
import java.util.*;
  
// Class of ReverseString
public class Main {
    public static void main(String[] args)
    {
        String input = "Geeks For Geeks";
        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;
  
        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }
        
        /*for (int i=0 ; i<temparray.length;i++)
            System.out.print(temparray[i]);*/
            for (char c : temparray)
            System.out.print(c);
        System.out.println();
        
    }
}
