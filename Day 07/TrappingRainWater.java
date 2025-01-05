//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
public class TrappingRainWater {
    public static int TrapedWater(int arr[]) {
        int LMax[]=new int[arr.length];
        int RMax[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(i==0){
                LMax[i]=arr[i];
            }
            else{
                if(LMax[i-1]>arr[i]){
                    LMax[i]=LMax[i-1];
                }
                else{
                    LMax[i]=arr[i];
                }
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1){
                RMax[i]=arr[i];
            }
            else{
                if(RMax[i+1]>arr[i]){
                    RMax[i]=RMax[i+1];
                }
                else{
                    RMax[i]=arr[i];
                }
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if((Math.min(LMax[i], RMax[i])-arr[i])>0){
                sum=sum+(Math.min(LMax[i], RMax[i])-arr[i]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        TrapedWater(arr);
    }
}
