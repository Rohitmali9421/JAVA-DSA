public class Stock {
    public static void MaxProfit(int[] arr) {
        int BuyPrice=Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(BuyPrice < arr[i]){
                MaxProfit=Math.max(MaxProfit, (arr[i]-BuyPrice));
            }else{
                BuyPrice=arr[i];
            }
        }
        System.out.println(MaxProfit);
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,5};
        MaxProfit(arr);
    }
}
