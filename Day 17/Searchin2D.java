
public class Searchin2D {

    public static void Search(int matrix[][],int target){
        int row=0;
        int col=matrix[0].length-1;

        while(row<=matrix.length-1 && col>=0 ){
            if(matrix[row][col]==target){
                System.out.println(row +" "+ col);
                break;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,5,7},{10,11,16,20},{23,30,34,60}};

        Search(matrix, 40);

    }
}
