import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine();
		char[] strArr = str.toCharArray();
		int[] freq = new int[str.length()];
		String newStr="";
		int i , j;
		for( i = 0 ; i<strArr.length; i++){
		    freq[i]=1;
		    for(j=i+1 ; j<strArr.length; j++){
		        if(strArr[i]==strArr[j]){
		            freq[i]++;
		          strArr[j] ='*';// to avoid visited character
		        }
		        
		    }
		}
		//System.out.println("Characters and their frequencies are :");
		for(i=0;i<freq.length; i++ ){
		    if(strArr[i]!=' '&& strArr[i]!='*'){
		       newStr+=strArr[i];
		       newStr+=freq[i];
		    }
		}
		System.out.println(newStr);
	}
}

