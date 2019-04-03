package figure;

public class Triangle extends Shape {
    double a;
    double b;
    double c;
    double p = (a+b+c)/2;

    public Triangle(Shape shape) {
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString () {
        description = "class= Triangle: color = " + color + "square = ";
        return description;
    }

    public double calcArea() {
        square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return square;
    }
}
