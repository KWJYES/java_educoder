package educoder.面向对象编程一_类与对象.第6关_深入理解类的定义;

import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请输入矩阵A的行列数（空格间隔)");
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        System.out.println("请逐行输入矩阵A的元素值（每输入一行回车一次，同一行相邻元素用空格分隔）");
        double[][] arrA = inputArray(rowNum, colNum);
        System.out.println("请输入矩阵B的行列数（空格间隔)");
        rowNum = sc.nextInt();
        colNum = sc.nextInt();
        System.out.println("请逐行输入矩阵B的元素值（每输入一行回车一次，同一行相邻元素用空格分隔）");
        double[][] arrB = inputArray(rowNum, colNum);
        Matrix matA = new Matrix(arrA);
        Matrix matB = new Matrix(arrB);
        // 执行矩阵乘法,关于矩阵乘法的定义，请参考线性代数相关知识或百度查询
        Matrix matC = matA.multiply(matB);
        // 输出矩阵乘法的结果，注：这里实际上隐含着调用matC.toString(),因此，Matrix要定义toString方法，返回矩阵的字符串表示
        System.out.println(matC);
        Test.sc.close();
    }

    /**
     * 输入一个二维数组，并返回这个数组的引用
     *
     * @param row 行数
     * @param col 列数
     * @return 数组的引用
     */
    public static double[][] inputArray(int row, int col) {
        double[][] a = new double[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                a[r][c] = sc.nextDouble();
            }
        }
        return a;
    }
}
