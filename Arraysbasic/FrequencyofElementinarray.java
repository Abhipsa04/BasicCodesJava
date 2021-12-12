// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] fr = new int[arr.length];
        int visited = -1;
        
        for(int i=0 ; i<arr.length ; i++){
            int count = 1; 
        for(int j = i+1 ; j < arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;// counting the frequency of element
                    fr[j]=visited;// mark them as visited
                }
            }
            if(fr[i]!=visited){// prohibiting to count the same element again
                fr[i]=count;
            }
        }
        for(int i = 0 ; i < fr.length ; i++)
        {
            if(fr[i] != visited)  
                System.out.println(arr[i] + " occurs "+ fr[i]+" times ");  
        }

        
    }
}
