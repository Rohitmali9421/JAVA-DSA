
public class printnumnto1 {
    public static void print(int num){
        if(num==0) return;
        System.out.println(num);
        print(num-1);
    }
    public static void print2(int num){
        if(num==0) return;
        print2(num-1);
        System.out.print(num +" ");
        
    }
    public static int sum(int num){
        if(num==0) return 0;
        
        return num+sum(num-1);
    }
    public static int fibonacci(int num){
        if(num==0) return 0;
        if(num==1) return 1;
        
        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static void main(String[] args) {
        // print(10);
        // print2(10);
        System.out.println(fibonacci(6));
    }
}
