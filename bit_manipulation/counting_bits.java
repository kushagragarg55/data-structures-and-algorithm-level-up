import java.util.*;

public class counting_bits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        while (n>0){
            n = n & (n-1);
            ans++;
        }
        System.out.println(ans);
    }
}