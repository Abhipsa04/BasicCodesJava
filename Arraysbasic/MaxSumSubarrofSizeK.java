class Solution{
    static int maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        
       int maxs=Integer.MIN_VALUE;
       int currs=0;
       int i =0;
       int j =0;
       while(j<Arr.size()){
           
           if(j-i+1<K){
               currs+=Arr.get(j);
               j++;
               
           }
           
           else if(j-i+1==K){
               currs+=Arr.get(j);
               maxs=Math.max(maxs,currs);
               currs-=Arr.get(i);
               
               
               i++;
               j++;
           }
       }
       return maxs;
        
    }
    }
