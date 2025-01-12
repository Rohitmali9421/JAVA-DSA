
public class Mergesort {

    public static void Msort(int[] arr ,int si ,int ei)  {
        if(si>=ei){
            return ;
        }
        int mid=si+(ei-si)/2;
        Msort(arr,si,mid);
        Msort(arr,mid+1,ei);
        Merge(arr ,si ,mid ,ei);
    }
    public static void Merge(int arr[] ,int si , int mid ,int ei){
        int temp[]=new int[ei-si+1];
        int i=0;
        int j=si;
        int k=mid+1;
        while(j<=mid && k<=ei){
            if(arr[j]<arr[k]){
                temp[i]=arr[j];
                j++;
            }else{
                temp[i]=arr[k];
                k++;
            }
            i++;
        }

        while (j<=mid) {
            temp[i++]=arr[j++];
        }
        while (k<=ei) {
            temp[i++]=arr[k++];
        }

        for(k=0,j=si;k<temp.length;j++,k++){
            arr[j]=temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[]={5,3,2,7,5,2};
        Msort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
