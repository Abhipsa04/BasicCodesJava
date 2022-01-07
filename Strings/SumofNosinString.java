class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        String temp = "0";
        long sum = 0;
        for(int i =0 ; i<str.length() ; i++)
        {
            if(Character.isDigit(str.charAt(i))){
                temp+=str.charAt(i);
            }
            else{
                sum+=Integer.parseInt(temp);
                temp = "0";
                
            }
            
            
            
        }
        return sum + Integer.parseInt(temp);
        // or it will give wrong output for just returning sum for the strings containing digits at end
       // if digit is present at last it should be added
    }
    
}
