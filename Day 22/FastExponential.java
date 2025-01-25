
public class FastExponential {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans[]=countBits(5);

        
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
