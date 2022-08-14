import java.util.*;

public class fastExponentiation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ans =1;
        int a = sc.nextInt();
        int n = sc.nextInt();
        while(n>0){
            int last_bit=n&1;
            if(last_bit==1){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
}