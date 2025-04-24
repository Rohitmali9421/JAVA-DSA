import java.util.*;

class Armstrong {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        int temp = num;
        int temp2 = 0;

        while (temp > 0) {
            temp2 = temp2 + (int)Math.pow((temp % 10),3);
            temp=temp/10;
        }
        if (temp2 == num) {

            System.out.println("Armstrong");
        }
    }
}