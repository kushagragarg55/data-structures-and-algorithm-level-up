import java.util.*;

public class decimaltoBinary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power_10 = 1;
        int ans=0;
        while(n>0){
            int rem=n%2;
            int number = rem*power_10;
            ans = ans+number;
            n=n/2;
            power_10=power_10*10;
        }
        System.out.println(ans);
    }
}