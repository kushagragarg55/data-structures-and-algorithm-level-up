

public class subarraySort {

    static boolean OutofOrder(int arr[],int i){
        if(i==0){
            return arr[i]>arr[i+1];
        }
        else if(i== arr.length-1){
            return arr[i]<arr[i-1];
        }
        return arr[i]>arr[i+1] || arr[i]<arr[i-1];
     }

    public static void main(String args[]){
        int arr[] = new int[]{1,2,3,4,5,8,6,7,9,10,11};
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        if(arr.length<=2){
            System.out.println("[-1,-1]");
            return;
        }
        //finding the largest and smallest mismatched integer in the array
        for(int i=1;i<arr.length-1;i++){
            if(OutofOrder(arr,i)){
                smallest = Math.min(arr[i],smallest);
                largest = Math.max(arr[i], largest);
            }
        }
        if(smallest==Integer.MAX_VALUE){
            System.out.println("[-1,-1]");
        }
        int left=0;
        while(smallest>=arr[left]){
            left++;
        }
        int right = arr.length-1;
        while (largest<=arr[right]){
            right--;
        }
        System.out.printf("[%d,%d]",left,right);
    }
}
