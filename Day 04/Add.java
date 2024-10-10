import java.util.*;
public class Add {
    public static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1=sc.nextInt();
        System.out.println("Enter second Number");
        int num2=sc.nextInt();
        System.out.println("Sum Is :"+add(num1, num2));
    }
}
