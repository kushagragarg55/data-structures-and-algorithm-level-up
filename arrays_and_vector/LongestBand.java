

/*
We need to find the length of the longest band in the given array. Band is defined as the consecutive subsequence of
numbers, having difference of one between each other.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class LongestBand {
    public static void main(String[] args){
        //declaring the array
        int arr[] = new int[]{1,9,3,0,18,5,2,4,10,7,12,6};

        //inserting all array number into hashSet for constant time complexity access of elements
        Set<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        int largest_len =0;

        //initiating a for loop to iterate over the array
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int parent_current = current-1;
            int current_len=0;
            if(!set.contains(parent_current)){

                int current_band_seq_number = current;
                while(set.contains(current_band_seq_number)){
                    current_len++;
                    current_band_seq_number++;
                }
            }
            largest_len = Math.max(largest_len,current_len);
        }
        System.out.println(largest_len);
    }
}
