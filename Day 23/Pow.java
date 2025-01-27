public class Pow {

    public static void power(double x, int n) {
        long exp=n;
        if(x==0){
            System.out.println(0);
            return;
        }
        boolean isNegative = false;
        if (exp < 0) {
            exp = exp * -1;
            isNegative = true;

        }
        double ans = 1;
        while (exp > 0) {
            if ((exp & 1) != 0) {
                ans = ans * x;

            }
            x = x * x;
            exp = exp >> 1;

        }
        if (isNegative) {
            System.out.println(1 / ans);
        } else {
            System.out.println(ans);
        }

    }

    public static void main(String[] args) {
        power(2, -2147483648);
    }
}
