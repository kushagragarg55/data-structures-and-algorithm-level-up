import java.util.*;

public class earthLevels{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //min number of steps would be count of set bits in binary representation of n
        int count=0;
        while(n>0){
            count += n&1;
            n=n>>1;
        }
        System.out.println(count);
    }
}