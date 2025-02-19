public class CountingSort {
    public static void CountS(int[] arr) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            max=Math.max(max, arr[i]);
        }
        int count[]=new int[max+1];
        for (int i = 0; i < arr.length ; i++) {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 2, 1 };
        CountS(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
