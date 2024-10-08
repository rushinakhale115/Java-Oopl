import java.lang.*;
import java.util.Scanner;

class Person3{
    Scanner sc=new Scanner(System.in);
    String name;
    void  Person3(){
        System.out.println("Enter Name:");
        name=sc.next();
    }
}
class Employee1 extends Person3{
    Scanner sc=new Scanner(System.in);
    int employeeid;

    void  Employee1(){
        super.Person3();
        System.out.println("Enter employeeid:");
        employeeid=sc.nextInt();
    }

}
class Manager3 extends Employee1{
    Scanner sc=new Scanner(System.in);
    String Department;
    Manager3(){
        super.Employee1();
        System.out.println("Enter Department:");
        Department=sc.next();
    }
    void display(){
        System.out.println("The Name is: "+name);
        System.out.println("The employeeid is:"+employeeid);
        System.out.println("the Department is: "+Department);

    }
}
public class Inheritance3{
    public static void main(String[] args) {
        Manager3 s2=new Manager3();
        s2.display();
    }
}

