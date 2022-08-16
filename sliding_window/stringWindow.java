import java.util.*;

public class stringWindow{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int n1 = s1.length();
        String s2 = sc.nextLine();
        int n2 = s2.length();
        HashMap <Character, Integer> fp = new HashMap<>();
        HashMap <Character, Integer> window = new HashMap<>();

        for(int i=0;i<n2;i++){
            char c = s2.charAt(i);
            if(!fp.containsKey(c)){
                fp.put(c,1);
            }else{
                fp.put(c,fp.get(c)+1);
            }
        }

        for(int i=0;i<n1;i++){
            char c = s1.charAt(i);

        }
    }
}