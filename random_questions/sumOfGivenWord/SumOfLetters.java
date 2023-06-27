import java.util.*;
public class Program
{
    static int fib(int n){
        int a=0,b=1, c=0;
        if(n==0){
            return a;
        }
        else if(n==1){
            return b;
        }
        for(int i=2;i<=n;i++){
            c=a+b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum =0;
        int len = str.length();
        for(int i=0;i<len;i++){
            char c = str.charAt(i);
            int val = fib(c-65);
            sum+=val;
        }
        System.out.println(sum);
	}
}
