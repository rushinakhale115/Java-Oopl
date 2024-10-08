import java.lang.*;
class Employee{
    String Name="Rushikesh";
    int id=115;
    int Basicpay=100000;
    double ta;
    double da;
    double total;
    double bonus;

    void Calculatesalary(){
        ta=0.05*Basicpay;
        da=0.02*Basicpay;
        total=Basicpay+ta+da;
        System.out.println("The Salary of the Employee is:"+total);
    }

}
class manager extends Employee{
    void Calculatesalary(){
        super.Calculatesalary();
        bonus=0.03*Basicpay;
        total=ta+da+Basicpay+bonus;
        System.out.println("The salary of the Manager is:"+total);

    }
}
public class Inheritance1{
    public static void main(String[] args) {
        manager s1=new manager() ;
        s1.Calculatesalary();

    }
}
