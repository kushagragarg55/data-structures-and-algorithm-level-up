import java.util.*;

public class common_ops{
    static int n;

    static int getIthBit(int i){
        int mask = 1<<i;
        int res=n&mask;
        if(res>0){
            return 1;
        }else{
            return 0;
        }
    }

    static void setIthBit(int i){
        int mask = 1<<i;
        n=n|mask;
        System.out.println(n);
    }

    static void clearIthBit(int i){
        int mask = ~(1<<i);
        n=n&mask;
    }

    static void updateIthBit(int i, int v){
        clearIthBit(i);
        n=n|(v<<i);
        System.out.println(n);
    }

    static void clearLastIthBit(int i){
        int mask = (~0)<<i;
        n=n&mask;
        System.out.println(n);
    }


    public static void main(String args[]){
        n =5;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int v = sc.nextInt();
//        int l = getIthBit(i);
//        setIthBit(i);
//        clearIthBit(i);
//        updateIthBit(i,v);
        clearLastIthBit(i);
    }
}