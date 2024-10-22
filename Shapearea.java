interface shape{
    double getarea(double l);

}
class rectangle implements shape{
    @Override
    public double getarea(double l ) {
        double b=20;
        return l*b;
    }
}
class circle implements shape{
    @Override
    public double getarea(double r ) {
        return 3.14*r*r;
    }
}
class triangle implements shape{
    @Override
    public double getarea(double h ) {
        double b=12;
        return 0.5*h*b;
    }
}
public class Shapearea {
    public static void displayarea(shape t, double l) {
        double area = t.getarea(l);
        System.out.println("Area of " + t.getClass().getSimpleName() + "for " + l + "cm is " + area + "units");
    }

    public static void main(String[] args) {
        double l = 25;

        shape rectangle = new rectangle();
        shape circle = new circle();
        shape triangle = new triangle();

        displayarea(rectangle, l);
        displayarea(circle, l);
        displayarea(triangle, l);
    }
}

