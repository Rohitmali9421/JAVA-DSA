import java.util.*;

public class DecimaltoBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Decimal Number");
        int decimalNum =sc.nextInt();
        int pow=0;
        int binaryNum=0;
        while (decimalNum>0) {
            binaryNum=binaryNum+(decimalNum % 2)* (int) Math.pow(10,pow);
            decimalNum=decimalNum/2;
            pow++;
        }    
        System.out.println(binaryNum);
    }
}
