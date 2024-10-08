import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=2;
        while(i<num/2){
            if(num%i==0){
                System.out.println("Number is prime");
                break;
            }
            i++;
        }

    }
}
