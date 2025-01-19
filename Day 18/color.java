
public class color {

    public static void sort(int nums[]){
        int mat[]=new int[3];

        for(int i=0;i<nums.length;i++){
            mat[nums[i]]++;
        }
        for (int i = 0, j = 0; i < mat.length; i++) {
            while (mat[i] > 0) {
                nums[j++] = i;
                mat[i]--;
            }
        }


    }
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sort(nums);

        System.out.println("\nAfter sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
    
}
