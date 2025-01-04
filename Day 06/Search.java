
public class Search {

    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,3,4,6,33,55,43,10};

        int index=linearSearch(numbers, 10);
        if(index==-1){
            System.out.println("Number not found");
        }else{
            System.out.println("Number foud at index "+index);
        }
    }
}
