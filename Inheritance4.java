import java.lang.*;
import java.util.Scanner;
 class Person4{
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    void  Person4(){
        System.out.println("Enter Name:");
        name=sc.next();
        System.out.println("Enter age:");
        age=sc.nextInt();

    }
}
class Student4 extends Person4 {

    int studentid;
    String grade;

    void Student4() {
        super.Person4();
        System.out.println("Enter studentid:");
        studentid = sc.nextInt();
        System.out.println("Enter your grade:");
        grade = sc.next();
    }

}
class graduatestudent extends Student4{
     Scanner sc=new Scanner(System.in);
     String thesistopic;
     graduatestudent(){
         super.Student4();
         System.out.println("Enter the topic:");
         thesistopic=sc.next();
     }
    void display(){
        System.out.println("The Name is:"+name);
        System.out.println("The age is:"+age);
        System.out.println("The Studentid is:"+studentid);
        System.out.println("The grade is :"+grade);
        System.out.println("the Topic is:"+thesistopic);
    }


}
public class Inheritance4 {
    public static void main(String[] args) {
        Student4 s3 = new Student4();
        graduatestudent s4=new graduatestudent();
        s4.display();

    }
}
