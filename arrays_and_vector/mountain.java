import java.lang.*;

public class mountain {
    public static void main(String[] args){
        int[] intArr = new int[]{5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4};
        int largest =0;
        int n = intArr.length;
        for(int i=1;i<=n-2;){
            if(intArr[i]>intArr[i-1] && intArr[i]>intArr[i+1]){
                int count=1;
                int j=i;
                //backward count
                while(j>=1 && intArr[j]>intArr[j-1]){
                    j--;
                    count++;
                }
                while(i<=n-2 && intArr[i+1]<intArr[i]){
                    i++;
                    count++;
                }
                largest = Math.max(largest, count);
            }else{
                i++;
            }
        }
        System.out.println(largest);

    }
}
