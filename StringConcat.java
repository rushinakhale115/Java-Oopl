import java.util.Scanner;
import java.lang.*;
public class StringConcat {
    public String concat(String a,String b){
        return a+b;
    }
    public String concat(String a,String b,String c){
        return a+b+c;
    }
    public String concat(String[] strings){
        return String.join(",",strings);
    }

    public static void main(String[] args) {
        StringConcat s1=new StringConcat();
        System.out.println("The two Strings concated is: "+s1.concat("Rushikesh","Ezra"));
        System.out.println("The Three Strings Concated is:"+s1.concat("Rushikesh"," Deepak"," Sumit"));

    }
}
