package educoder.面向对象编程一_类与对象.第2关_类的定义与对象的创建;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        calculateArea();
    }

    /**
     * 计算面积
     * 使用 海伦公式
     * S=sqrt[p(p-a)(p-b)(p-c)]
     * 其中 p=(a+b+c)/2
     */
    private void calculateArea() {
        double p =(sideA+sideB+sideC)/2;
        area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getArea() {
        return area;
    }
}
