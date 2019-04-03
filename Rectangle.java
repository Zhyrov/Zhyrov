package figure;

public class Rectangle extends Shape {
    double widht;
    double height;

    public Rectangle(Shape shape) {
    }

    public Rectangle(String color, double widht, double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public String toString () {
        description = "class= Rectangle: color = " + color + "square = ";
        return description;
    }

    public double calcArea() {

        square = widht*height;
        return square;
    }
}
