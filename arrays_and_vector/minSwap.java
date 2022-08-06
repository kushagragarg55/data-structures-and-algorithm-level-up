import java.text.CollationElementIterator;
import java.util.*;

public class minSwap {

    public static void main(String args[]){
        int arr[] = new int[]{10,11,5,4,3,2,1};

        //adding the array into a hashmap
        TreeMap <Integer,Integer> hm=new TreeMap<Integer,Integer>();
        Vector <Boolean> visited = new Vector<>(arr.length);
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
            visited.add(false);
        }

        Set <Map.Entry<Integer,Integer>> entrySet = hm.entrySet();
        List <Map.Entry<Integer,Integer>> list = new ArrayList<>(entrySet);
        int ans=0;

        for(int i=0;i<arr.length;i++){

            //if the element is visited or element is in the right position
            int old_position = list.get(i).getValue();
            if(visited.get(i) || old_position==i){
                continue;
            }

            int node = i;
            int cycle=0;
            while(!visited.get(node)){
                visited.set(node,true);
                int new_node = list.get(node).getValue();
                node = new_node;
                cycle++;
            }
            ans+=(cycle-1);
        }
        System.out.println(ans);

    }
}
