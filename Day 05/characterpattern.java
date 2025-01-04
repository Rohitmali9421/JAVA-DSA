// A
// BC
// DEF
// GHIJ

import java.util.*;
public class characterpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        char a = 'A';
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}
