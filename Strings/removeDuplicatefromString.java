import java.util.*;

public class Main
{
    static void removeDupli(String str){
        String newStr ="";
        for(int i = 0 ; i< str.length();i++){
            char charAtIndex = str.charAt(i);
            if(charAtIndex==' '){
                newStr+=' ';
            }
            if(newStr.indexOf(charAtIndex)<1){
                newStr+= charAtIndex;
            }
        }
        System.out.println(newStr);
    }
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		removeDupli(str);
	}
}
