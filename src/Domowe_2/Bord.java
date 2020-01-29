package Domowe_2;

public class Bord {

    private double[] matrix;
    private double sumMatrix;

    private Chessboard(){
        this.matrix = new double[64];
        fillMatrix(matrix);
        this.sumMatrix = matrixSum(matrix);
    }

    private void fillMatrix(double[] matrix){
        for(int i = 0; i<matrix.length; i++)
            if(i==0){
                matrix[i]=1;
            } else if(i==1){
                matrix[i]=2;
            }   else if (i==2){
                matrix[i]=4;
            } else {
                matrix[i]=matrix[i-1] * 2;
            }
    }

    private double matrixSum(double[] matrix){
        for(double element: matrix){
            this.sumMatrix = this.sumMatrix + element;
        }
        return sumMatrix;
    }

    private void showMatrixValues(){
        int index = 1;
        for(double element: this.matrix){
            System.out.println(index + " " + element);
            index++;
        }
    }

    private void showSumOfMatrixValues(){
        System.out.println("Total sum of matrix sum value is: " + this.sumMatrix);
    }

    public static void main(String[] args) {

        Chessboard mm = new Chessboard();
        mm.showMatrixValues();
        mm.showSumOfMatrixValues();

    }
}
