import java.util.*;

public class hashmap {

    public static void main(String[] args){
        HashMap<String, Vector<Integer>> hm = new HashMap<> ();
        hm.put("Krishna", new Vector<>());
        hm.get("Krishna").add(1);
        hm.get("Krishna").add(2);
        hm.put("lol", new Vector<>());
        hm.get("lol").add(1);
        System.out.println(hm);
    }
}
