package educoder.面向对象编程一_类与对象.第6关_深入理解类的定义;

public class Matrix {
    public double [][] arr;
    public Matrix() {
    }

    public Matrix(double[][] arr) {
        this.arr = arr;
    }

    public Matrix multiply(Matrix matB){
        Matrix matC = new Matrix();
        matC.arr = new double[this.arr.length][matB.arr[0].length];
        for(int i=0;i<this.arr.length;i++){
            for(int j=0;j<matB.arr[0].length;j++){
                matC.arr[i][j] = 0;
                for(int k=0;k<this.arr[0].length;k++){
                    matC.arr[i][j] += this.arr[i][k]*matB.arr[k][j];
                }
            }
        }
        return matC;
    }

    public String toString(){
        String result = "[\n";
        for(int i=0;i<arr.length;i++){
            result+="[";
            for(int j=0;j<arr[0].length;j++){
                result+=arr[i][j]+"00 ";
            }
            result += "]\n";
        }
        result+="]\n";
        return result;
    }
}




