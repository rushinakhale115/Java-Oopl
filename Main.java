
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.io.*;
public class Main {

    static void sal()
    {
     Scanner sc=new Scanner(System.in);
        double basic,HRA,TA,total,gross,tax;
        System.out.println("Enter the Basic pay:");
         basic=sc.nextFloat();
         HRA=(0.05*basic);
         TA=(0.02*basic);
         total=basic+HRA+TA;
         tax=0.02*total;
         gross=total-tax;
        System.out.println("The HRA is "+HRA);
        System.out.println("The TA  is "+TA);
        System.out.println("The tax applicable is " + tax);
        System.out.println("The gross salary is "+gross);

    }

    static void  display(String name, int age)

    {
        System.out.println("The name is " +name);
        System.out.println("The age is " +age);

    }
    public static void main(String[] args) {
        int age;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.next();
        System.out.println("Enter the age:");
        age = sc.nextInt();
        display(name,age);
        sal();

    }
}