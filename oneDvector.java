import java.util.*;

public class oneDvector {
    public static void main(String[] args){
        Vector <Integer> arr =  new Vector<>();

        //add the elements in constant time
        arr.add(2);
        arr.add(3);

        System.out.println(arr.capacity());

        for(int number: arr){
            System.out.println(number);
        }
    }
}
