package educoder.面向对象编程一_类与对象.第6关_深入理解类的定义;


import java.math.BigDecimal;
import java.math.RoundingMode;
/*
public class Matrix {
    private double[][] arr;
    private BigDecimal[][] bigDecimals;

    public Matrix(double[][] arr) {
        this.arr = arr;
        bigDecimals = new BigDecimal[arr.length][arr[0].length];
        for (int i = 0; i < bigDecimals.length; i++) {
            for (int j = 0; j < bigDecimals[0].length; j++) {
                bigDecimals[i][j] = new BigDecimal(String.format("%.3f", arr[i][j]));
                //bigDecimals[i][j] = bigDecimals[i][j].setScale(3, RoundingMode.HALF_EVEN);//保留3位小数
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
                //arr[i][j] = arr[i][j].setScale(3, RoundingMode.HALF_EVEN);//保留3位小数
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
                //d = d.setScale(3, RoundingMode.HALF_EVEN);//保留3位小数
                str.append(String.format("%.3f",d.doubleValue())).append(" ");
            }
            str.append("]\n");
        }
        str.append("]");
        return str.toString();
    }
}
*/


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
                arr[i][j] = 0;
                for (int k = 0; k < arr[0].length; k++) {
                    arr[i][j] = Arith.add(arr[i][j], Arith.mul(arrA[i][k], arrB[k][j]));
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
                str.append(String.format("%.3f",Arith.round(d,3))).append(" ");
            }
            str.append("]\n");
        }
        str.append("]");
        return str.toString();
    }

    static class Arith {

        //这个类不能实例化
        private Arith() {
        }

        /**
         * 提供精确的加法运算。
         *
         * @param v1 被加数
         * @param v2 加数
         * @return 两个参数的和
         */
        public static double add(double v1, double v2) {
            BigDecimal b1 = new BigDecimal(Double.toString(v1));
            BigDecimal b2 = new BigDecimal(Double.toString(v2));
            return b1.add(b2).doubleValue();
        }

        /**
         * 提供精确的乘法运算。
         *
         * @param v1 被乘数
         * @param v2 乘数
         * @return 两个参数的积
         */
        public static double mul(double v1, double v2) {
            BigDecimal b1 = new BigDecimal(Double.toString(v1));
            BigDecimal b2 = new BigDecimal(Double.toString(v2));
            return b1.multiply(b2).doubleValue();
        }

        /**
         * 提供精确的小数位四舍五入处理。
         *
         * @param v     需要四舍五入的数字
         * @param scale 小数点后保留几位
         * @return 四舍五入后的结果
         */
        public static double round(double v, int scale) {
            if (scale < 0) {
                throw new IllegalArgumentException(
                        "The scale must be a positive integer or zero");
            }
            BigDecimal b = new BigDecimal(Double.toString(v));
            BigDecimal one = new BigDecimal("1");
            return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
    }
}




