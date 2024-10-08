import java.util.Scanner;
import java.lang.*;
public class MethodOverloading {

    public int Area(int l,int b){
        return (l*b);
    }
    public double Area(int r){
        return 3.14*r*r;
    }
    public double Area(float base,float height){
        return 0.5*base*height;
    }
    public int Perimeter(int l,int b){
        return (l+b)*2;
    }
    public int Perimeter(int side1,int side2,int side3){
        return side1+side2+side3;
    }
    public double Perimeter(int r){
        return 2*3.14*r;
    }

    public static void main(String[] args) {
        MethodOverloading m1=new MethodOverloading();
        System.out.println("The area of circle is:"+m1.Area(3));
        System.out.println("The area of Triangle is:"+m1.Area(3,2));
        System.out.println("The area of Rectangle is :"+m1.Area(3,5));
        System.out.println("The Perimeter of Rectangle is :"+m1.Perimeter(4,7));
        System.out.println("The Perimeter of Circle is :"+m1.Perimeter(7));
        System.out.println("The Perimeter of Triangle is :"+m1.Perimeter(2,6,8));
    }
}
