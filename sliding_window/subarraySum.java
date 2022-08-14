import java.util.*;

public class subarraySum{
    public static void main(String args[]){
        int arr[]= new int[]{10,2,-2,-20,10};
        int sum=-10;
        int n = arr.length;
        HashMap <Integer, Integer> hm = new HashMap<Integer,Integer> ();
        hm.put(0, 1);
        int res=0;
        int currsum=0;
        for(int i=0;i<n;i++){
            currsum+=arr[i];

            int remove_sum = currsum-sum;
            if(hm.containsKey(remove_sum)){
                res+=hm.get(remove_sum);
            }

            hm.put(currsum,hm.getOrDefault(currsum,0)+1);
        }
        System.out.println(res);
    }
}