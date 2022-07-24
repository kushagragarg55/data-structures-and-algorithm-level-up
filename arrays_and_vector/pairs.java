
import java.util.*;

public class pairs {
    public static void main(String[] args){
        Vector <Integer> arr=new Vector<>();
        // {10, 5, 2, 3, -6, 9, 11} find a unique pair which is equal to s
        arr.add(10);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(-6);
        arr.add(9);
        arr.add(11);
        Vector <Integer> result = new Vector<Integer>();
        int s=4;
        Set <Integer> set = new HashSet<>();
        for(int i=0;i<arr.size();i++){
            int current = arr.get(i);
            int current_complement = s-current;
            if(set.contains(current_complement)){
                result.add(current);
                result.add(current_complement);
                break;
            }
            set.add(current);
        }
        System.out.println(result);
    }

}
