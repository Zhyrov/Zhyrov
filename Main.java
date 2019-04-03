package figure;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        main.view();
        main.calcSum();
        main.calcSumShape();
    }

    public Shape[] arr = {
        new Rectangle("blue", 23, 21),
        new Rectangle("green", 12, 3),
        new Rectangle("red", 12, 31),
        new Rectangle("white", 12, 9),
        new Circle("black", 10),
        new Circle("orange", 9),
        new Circle("yellow", 11),
        new Triangle("grey", 8, 7, 6),
        new Triangle("brown", 11, 6, 3),
    };

    public void view (){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] instanceof Rectangle ){
                Rectangle r = new Rectangle(arr[i]);
                System.out.println(r.description + r.square);
            }
            if (arr[i] instanceof Circle ){
                Circle r = new Circle(arr[i]);
                System.out.println(r.description + r.square);
            }
            if (arr[i] instanceof Triangle){
                Triangle r = new Triangle(arr[i]);
                System.out.println(r.description + r.square);
            }
        }
    }

    public void calcSum (){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] instanceof Rectangle ){
                Rectangle r = new Rectangle(arr[i]);
                sum = sum + r.square;
            }
            if (arr[i] instanceof Circle ){
                Circle r = new Circle(arr[i]);
                sum = sum + r.square;
            }
            if (arr[i] instanceof Triangle){
                Triangle r = new Triangle(arr[i]);
                sum = sum + r.square;
            }
        }
        System.out.println("Square of Shape = " + sum);
    }

    public void calcSumShape(){
        double[] sumShapeRCT = {0, 0, 0};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] instanceof Rectangle ){
                Rectangle r = new Rectangle(arr[i]);
                sumShapeRCT[0] = sumShapeRCT[0] + r.square;
            }
            if (arr[i] instanceof Circle ){
                Circle r = new Circle(arr[i]);
                sumShapeRCT[1] = sumShapeRCT[1] + r.square;
            }
            if (arr[i] instanceof Triangle){
                Triangle r = new Triangle(arr[i]);
                sumShapeRCT[2] = sumShapeRCT[2] + r.square;
            }
        }
        System.out.println("Sum of Rectangle=" + sumShapeRCT[0] + " sum of Circle=" + sumShapeRCT[1] + " sum of Triangle=" + sumShapeRCT[2]);
    }
}
