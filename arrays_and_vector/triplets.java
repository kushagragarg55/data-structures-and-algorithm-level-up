import java.util.*;

public class triplets {

    public static void main(String[] args){
        Vector <Integer> arr = new Vector<>();
        arr.add(15);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        int sum = 18;

        Vector<Vector<Integer>> result= new Vector<Vector<Integer>>();

        Collections.sort(arr);

        for(int i=0;i<arr.size()-3;i++){
            //two pointer
            int j=i+1;
            int k=arr.size()-1;
            while(j<k){

                int current_sum = arr.get(i);
                current_sum+=arr.get(j);
                current_sum+=arr.get(k);

                if(current_sum == sum){
                    Vector <Integer> v1 = new Vector<Integer>();
                    v1.add(arr.get(i));
                    v1.add(arr.get(j));
                    v1.add(arr.get(k));
                    result.add(v1);
                    j++;
                    k--;
                }
                else if(current_sum>sum){
                    k--;
                }
                else {
                    j++;
                }
            }

        }
        System.out.println(result);
    }
}
