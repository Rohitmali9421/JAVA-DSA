import java.util.*;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number");
        int binaryNum=sc.nextInt();

        int pow=0;
        double decimalNum=0;

        while(binaryNum > 0){
            decimalNum = decimalNum + ((binaryNum % 10) * Math.pow(2, pow));
            binaryNum=binaryNum/10;
            pow++;
        }
        System.out.println(decimalNum);
    }
}
