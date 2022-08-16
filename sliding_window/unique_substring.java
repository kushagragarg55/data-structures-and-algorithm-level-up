import java.util.*;

public class unique_substring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap <Character, Integer> hm = new HashMap<Character, Integer>();
        int i=0,j=0;
        int n = str.length();
        int start_window = -1;
        int window_len =0;
        int max_window_len = 0;
        while(j<n){
            char current_char = str.charAt(j);

            //if it is inside hashmap & its idx>= start of the current window
            if(hm.containsKey(current_char) && hm.get(current_char)>=i){
                i = hm.get(current_char)+1;
                window_len = j-i;
            }

            //update the last occ
            window_len++;
            hm.put(current_char,j);
            j++;

            //update max_window_len at every step
            if(window_len>max_window_len){
                max_window_len = window_len;
                start_window = i;
            }
        }
        System.out.println(str.substring(start_window,max_window_len));
    }
}