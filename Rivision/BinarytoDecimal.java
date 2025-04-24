import java.util.*;

class BinarytoDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int temp = 0;
        int i = 0;
        while (num > 0) {
            temp = temp + (int) Math.pow(2, i) * (num % 10);
            i++;
            num = num / 10;
        }
        System.out.println(temp);
    }
}