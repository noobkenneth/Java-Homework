public class Triangle extends GeometricObject {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle(){
        this.color = "red";
        this.filled = true;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        double A = Math.pow((s * (s - this.side1) * (s - this.side2) * (s - this.side3)), 0.5);
        return A;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public String toString() {
        return "Triangle: side 1 = " + this.side1 + " side 2 = " + this.side2 + " side 3 = " + this.side3;
    }


}
