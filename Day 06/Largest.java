import java.util.*;
public class Largest {

    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,3,4,6,33,55,43,10};
        
        System.out.println(largest(numbers));
    }
}
