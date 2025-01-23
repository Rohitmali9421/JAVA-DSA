public class PowerOfTwo {

    public static void check(int n){
        if((n & n-1)==0){
            System.out.println( "Yes");
            return;
        }
        System.out.println("no");
    }
    public static void main(String[] args) {
        check(16);
    }
}
