import java.util.*;
public class TaxCalulate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if(income<500000){
            tax=0;
        } else if (income>4000){
            tax =(int) (income*0.2);
        }else{
            tax =(int) (income*0.8);
        }
        System.out.println(tax);
    }
}
