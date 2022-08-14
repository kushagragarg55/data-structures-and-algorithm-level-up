import java.util.*;

public class replaceBitsChallenge{

    static int clearbitinrange(int n, int i,int j){
        int a=(~0<<(j+1));
        int b=(1<<i)-1;
        int mask = a|b;
        return n&mask;
    }

    static int replacebits(int n,int i,int j,int m){
        m=m<<i;
        return m|n;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();

        n=clearbitinrange(n,i,j);
        int ans = replacebits(n,i,j,m);
        System.out.println(ans);
    }
}