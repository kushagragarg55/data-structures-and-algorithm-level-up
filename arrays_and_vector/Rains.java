
/*
Given N non-negative integers representing an elevation map where width of ach bar is 1 , compute how much water it can
trap after raining.

 */


public class Rains {
    public static void main(String args[]){

        int arr[]= new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        if(arr.length<=2){
            System.out.println("0");
        }

        int leftHeight[] = new int[arr.length];
        int rightHeight[] = new int[arr.length];

        leftHeight[0] = arr[0];
        rightHeight[0] = arr[arr.length-1];

        //leftHeight
        for(int i=1;i<arr.length;i++){
            leftHeight[i] = Math.max(arr[i],leftHeight[i-1]);
        }

        //rightHeight
        for(int i=arr.length-2;i>=0;i--){
            rightHeight[i] = Math.max(arr[i],rightHeight[i+1]);
        }

        //printing right and left
        for(int i: rightHeight){
            System.out.print(i);

        }
        System.out.println();
        for(int i:leftHeight){
            System.out.print(i);
        }
        int water[] = new int[arr.length];

        for(int i=1;i< arr.length-1;i++){
            int min = Math.min(leftHeight[i], rightHeight[i]);

            water[i] = min-arr[i];
        }
        System.out.println();
        int sum=0;
        for(int i: water){
            sum+=i;
            System.out.print(i);
        }
        System.out.println();
        System.out.println(sum);
    }
}
