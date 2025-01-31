
public class MethodOverloading {
    public static void sum(int a ,int b){
        System.out.println(a+b);
    }
    public static void sum(double a ,double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        sum(1,2);
        sum(1.1,2.1);
        sum(5,2);
    }
}
