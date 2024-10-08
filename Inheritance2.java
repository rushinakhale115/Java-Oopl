import java.lang.*;
import java.util.Scanner;
class Person2{
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
     void  Person2(){
         System.out.println("Enter Name:");
         name=sc.next();
         System.out.println("Enter age:");
         age=sc.nextInt();

    }
}
class Student extends Person2{
    Scanner sc=new Scanner(System.in);
    int studentid;

    Student(){
         super.Person2();
        System.out.println("Enter studentid:");
         studentid=sc.nextInt();
    }
    void display(){
        System.out.println("The Name is: "+name);
        System.out.println("The age is:"+age);
        System.out.println("the Studentid is: "+studentid);

    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Student s2=new Student();
        s2.display();
    }
}
