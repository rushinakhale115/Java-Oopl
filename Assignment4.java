import java.io.*;
import java.util.Scanner;

class libraryitems{
    public String  store() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book name:");
        String bookname =sc.next();
        System.out.println("Enter Dvd name:");
        String Dvds = sc.next();
        return bookname;
    }
}
class specific extends libraryitems{
    String Author="Rushikesh";
    int price=456;

    String publishedby="Ezra";
    int num=34;
}
public class Assignment4 {
    public static void main(String[] args) {
        specific l1=new specific();
        System.out.println("The Name of the book is:"+l1.store());
        System.out.println("The Author of the book is :"+ l1.Author);
        System.out.println("The price of the book is :"+l1.price);
        System.out.println("The Name of the dvd is:"+l1.store());
        System.out.println("The Dvd is published by :"+l1.publishedby);
        System.out.println("The number of the dvd is :"+l1.num);
    }
}
