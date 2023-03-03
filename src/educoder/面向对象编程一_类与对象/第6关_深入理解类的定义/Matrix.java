package educoder.面向对象编程一_类与对象.第6关_深入理解类的定义;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Matrix {
    private double[][] arr;
    private BigDecimal[][] bigDecimals;

    public Matrix(double[][] arr) {
        this.arr = arr;
        bigDecimals = new BigDecimal[arr.length][arr[0].length];
        for (int i = 0; i < bigDecimals.length; i++) {
            for (int j = 0; j < bigDecimals[0].length; j++) {
                bigDecimals[i][j] = new BigDecimal(String.format("%.3f", arr[i][j]));
                bigDecimals[i][j] = bigDecimals[i][j].setScale(3, RoundingMode.HALF_EVEN);//保留3位小数
            }
        }
    }

    public Matrix(BigDecimal[][] bigDecimals) {
        this.bigDecimals = bigDecimals;
    }

    public BigDecimal[][] getBigDecimals() {
        return bigDecimals;
    }

    public Matrix multiply(Matrix matrix) {
        BigDecimal[][] arrB = matrix.getBigDecimals();
        BigDecimal[][] arrA = this.bigDecimals;

        BigDecimal[][] arr = new BigDecimal[arrA.length][arrB[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=new BigDecimal("0.000");
                arr[i][j] = arr[i][j].setScale(3, RoundingMode.HALF_EVEN);//保留3位小数
                for (int k = 0; k < arr[0].length; k++) {
                    arr[i][j] = arr[i][j].add(arrA[i][k].multiply(arrB[k][j]));
                }
            }
        }
        return new Matrix(arr);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[\n");
        for (BigDecimal[] line : bigDecimals) {
            str.append("[");
            for (BigDecimal d : line) {
                d = d.setScale(3, RoundingMode.HALF_EVEN);//保留3位小数
                str.append(d).append(" ");
            }
            str.append("]\n");
        }
        str.append("]");
        return str.toString();
    }
}

/*

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
                arr[i][j]=0;
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



 */
