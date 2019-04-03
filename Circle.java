package figure;

class Circle extends Shape {
    double radius;
    final double pi = 3.14;

    public Circle(Shape shape) {}

    public Circle (String color, double radius){
        super(color);
        this.radius = radius;
    }

    public String toString () {
        description = "class= Circle: color = " + color + "square = ";
        return description;
    }

    public double calcArea() {
        square = pi*radius*radius;
        return square;
    }
}
