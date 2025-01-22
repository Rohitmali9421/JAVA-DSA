import java.util.*;
public class FindIthBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        System.out.println("Enter position");
        int i=sc.nextInt();

        int bitMask=1<<i;
        if((bitMask & num )==0){
            System.out.println("Ith bit is 0");
        }else{
            System.out.println("Ith bit is 1");
        }

    }
}
