
//java program to create class counter with a static variable count,
//impliment a constructor that increments the count every time,
//and object is created. print, the value of count after creating,
//several objects
public class counter {
    static int count = 0;

    static void counter() {
        count = count+1;
        System.out.println("The Count is :" + count);
    }

    public static void main (String[]args){
        counter.counter();
        counter.counter();
    }

}


