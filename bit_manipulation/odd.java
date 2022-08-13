import java.util.*;

public class odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if((i & 1)==0){
           System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}