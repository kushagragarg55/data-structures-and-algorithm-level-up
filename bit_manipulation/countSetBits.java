import java.util.*;

public class countSetBits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n =sc.nextInt();
        while(n>0){
            count+=(n&1);
            n=n>>1;
        }
        System.out.println(count);
    }
}