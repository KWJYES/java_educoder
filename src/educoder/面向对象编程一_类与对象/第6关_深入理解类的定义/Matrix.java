package educoder.面向对象编程一_类与对象.第6关_深入理解类的定义;


public class Matrix {
    private double[][] arr;

    public Matrix(double[][] arr) {
        this.arr = arr;
    }

    public double[][] getArr() {
        return arr;
    }

    public Matrix multiply(Matrix matrix) {
        double[][] arrB = matrix.getArr();
        double[][] arrA = this.arr;

        double[][] arr = new double[arrA.length][arrB[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0].length; k++) {
                    arr[i][j] += arrA[i][k] * arrB[k][j];
                }
            }
        }
        return new Matrix(arr);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[\n");
        for (double[] line : arr) {
            str.append("[");
            for (double d : line) {
                str.append(String.format("%.3f ", d));
            }
            str.append("]\n");
        }
        str.append("]");
        return str.toString();
    }
}
