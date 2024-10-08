import java.util.Locale;
import java.util.Scanner;
import java.lang.String;
public class StringDemo1 {
    public static void main(String[] args) {
        String name=new String("Rushikesh");
        String name2=new String("Ezra");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want:");
        int choice=sc.nextInt();

        switch (choice){
            case  1:
                char ch = name.charAt(2);
                System.out.println("The Character At index you Entered is:"+ch);
                break;

            case 2:
                System.out.println("The String Length is :" +name.length());
                break;

            case 3:
                System.out.println("The Concated String  is :"+name.concat(name2));
                break;

            case 4:
                System.out.println("The Substring is :"+name.substring(2));
                break;

            case 5:
                System.out.println("The Substring is :"+name.substring(0,5));
                break;

            case 6:
                if(name.isEmpty()) {
                    System.out.println("The String is Empty");
                }
                else{
                        System.out.println("The String is not Empty");
                    }

                break;

            case 7:
                System.out.println("The string is :"+name.toUpperCase(Locale.ROOT));
                break;

            case 8:
                System.out.println("The string is :"+name.toUpperCase(Locale.ROOT));
                break;

            case 9:
                System.out.println("The string is :"+name.toUpperCase(Locale.ROOT));
                break;

            case 10:
                if (name.equals(name2)){
                    System.out.println("The String 1 and 2 are Equal");
                }
                else{
                    System.out.println("The String 1 and 2 are not equal");
                }

            case 11:
                Scanner s1=new Scanner(System.in);
                System.out.println("Enter the Character Whose Index you want:");
                String  character= s1.nextLine();
                System.out.println("The index of the entered character is :"+name.indexOf(character));
                break;



            default:{
                System.out.println("Invalid Choice");
            }
        }
    }
}
