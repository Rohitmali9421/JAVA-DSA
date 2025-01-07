import java.util.*;

public class array2d {
    public static void PrintSpiral(int[][] arr) {
        int RStart = 0;
        int REnd = arr.length - 1;
        int CStart = 0;
        int CEnd = arr[0].length - 1;

        while (RStart <= REnd && CStart <= CEnd) {
            // Top
            for (int j = CStart; j <= CEnd; j++) {
                System.out.print(arr[RStart][j] + " ");
            }
            // Right
            for (int j = RStart + 1; j <= REnd; j++) {
                System.out.print(arr[j][CEnd] + " ");
            }
            // Bottom
            for (int j = CEnd - 1; j >= CStart; j--) {
                if(RStart==REnd)
                break;

                System.out.print(arr[REnd][j] + " ");
            }
            // Left
            for (int j = REnd - 1; j >= RStart + 1; j--) {
                if(CStart==CEnd)
                break;

                System.out.print(arr[j][CStart] + " ");
            }
            RStart++;
            REnd--;
            CStart++;
            CEnd--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array2d[][]=new int[3][3];
        int n=3, m=3;
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
        array2d[i][j]=sc.nextInt();
        }
        }
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
        System.out.print(array2d[i][j]+" ");
        }
        System.out.println();
        }
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        PrintSpiral(arr);
    }
}
