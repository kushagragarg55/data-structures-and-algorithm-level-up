import java.util.*;

public class housing {
    void housing(){

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int plots[]=new int[]{1,3,2,1,4,1,3,2,1,1};
        int k=8;
        int n= plots.length;

        int i=0;
        int cs=0;
        int j=0;

        while(j<n){
            //moving towards right
            cs+=plots[j];
            j++;
            //remove elements from left if cs>sum and i<j
            while(cs>k && i<j){
                cs=cs-plots[i];
                i++;
            }
            //check if at any given point
            if(cs==k) {
                //print that window
                System.out.printf("%d is staring index and %d is end index",i,j-1);
                System.out.println();
            }
        }
    }
}