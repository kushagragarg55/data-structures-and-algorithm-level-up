import java.util.*;

public class twoDvector {
    public static void main(String[] args){
        Vector <Vector<Integer>> arr = new Vector<>();

        Vector <Integer> v1 = new Vector<>();
        v1.add(2);
        v1.add(3);

        Vector <Integer> v2 = new Vector<>();
        v2.add(4);

        arr.add(v1);
        arr.add(v2);

        for(int i=0;i<arr.size(); i++){
            for(int number :arr.get(i)){
                System.out.println(number + " ");
            }
            System.out.println();
        }
    }
}
