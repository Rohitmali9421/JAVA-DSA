public class sumNum {
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        return n+Sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Sum(5));
    }
}
