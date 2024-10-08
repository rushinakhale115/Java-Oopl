public class UseofStatic {
    static int a=60;
    int b=80;
    void Display()
    {
        System.out.println(a);
        System.out.println(b);
    }
    static void StaticDisplay(){
        System.out.println(a);
    }

    public static void main(String[] Rushikesh) {
        UseofStatic s1=new UseofStatic();
        s1.Display();
        StaticDisplay();
    }
}