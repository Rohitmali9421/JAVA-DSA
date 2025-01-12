public class DiagonalTraverse {
    public static void Traverse(int[][] mat) {
        int r=0 ,c=0 ,n = mat.length , m = mat[0].length;
        int arr[]=new int[n*m];

        for(int i=0;i<arr.length;i++){
            arr[i]=mat[r][c];
            System.out.print(arr[i]+" ");
            if((r+c)%2==0){ //upword
                if (c==m-1){
                    r++;
                }
                else if(r==0){
                    c++;
                }
                else{
                    r--;
                    c++;
                }

            }else{ //downword
                if (r==n-1){
                    c++;
                }
                else if(c==0){
                    r++;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Traverse(mat);
    }
}
