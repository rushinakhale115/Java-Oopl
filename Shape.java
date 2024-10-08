
public class Shape {
    public void draw(){
        System.out.println("Draw a Shape");
    }
    public static class Circle extends Shape{
        @Override
        public void draw() {
            System.out.println("Draw a Circle");

        }
        public void draw(int r){
            System.out.println("The Circle Should be of radius:"+r);
        }
    }

    public static void main(String[] args) {
        Shape s1=new Shape();
        s1.draw();
        Circle c1=new Circle();
        c1.draw(4);
    }
}

