import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        int i = 0;
        int bin = 0;
        while (num > 0) {
            bin = bin + ((num % 2) * (int) Math.pow(10, i));
            num = num / 2;
            i++;
        }
        System.out.println(bin);

    }
}
