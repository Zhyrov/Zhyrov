package figure;

public class Shape {
    String color = "red";
    String description = "class= : color = ";
    double square = 0;

    public Shape () {

    }

    public Shape(String color) {
        this.color = color;
    }

    public String toString () {
        return description;
    }

    public double calcArea () {
        return square;
    }
}
