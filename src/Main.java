public class Main {
    public static void main(String[] args) {
        Shape f1 = new Circle(6.0);
        Shape f2 = new Rectangle(4.0, 2.0);
        Shape larger = getLargerShape(f1,f2);

        System.out.println("Площадь большей фигуры: " + larger.area());
    }

    public static Shape getLargerShape(Shape f1, Shape f2) {
        if (f1.area() > f2.area()) {
            return f1;
        } else {
            return f2;
        }
    }
}
