import java.util.*;
public class bookstore {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Store[] bookarray=new Store[2];
        for(int i=0;i<bookarray.length;i++){
            bookarray[i]=new Store();
            bookarray[i].Getbooks();
        }
        System.out.println("enter any choice");
        int n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println("To search the book enter name of book: ");
                String new_title=sc.next();
                for(int i=0;i<bookarray.length;i++){
                    if(new_title.equals(bookarray[i].title)){
                        System.out.println("The book with title: "+new_title+" is AVAILABLE");
                        System.out.println("The price of book is: "+bookarray[i].price);
                        System.out.println("The quantity of book is:"+bookarray[i].qty);
                    }
                    else{
                        System.out.println("The book is not available");
                    }
                }
                break;
            case 2:
                System.out.println("To search book by author");
                String new_author=sc.next();
                for(int i=0;i<bookarray.length;i++){
                    if(new_author.equals(bookarray[i].author)){
                        System.out.println("The available books of author are:"+bookarray[i].title);
                    }
                    else{
                        System.out.println("The book of this author is not available");
                        System.out.println("The price of book is: "+bookarray[i].price);
                        System.out.println("The quantity of book is:"+bookarray[i].qty);
                        System.out.println("The quantity of book is:"+bookarray[i].rate);
                    }
                }
                break;
            case 3:
                System.out.println("Enter the name of book you want to rate: ");
                new_title=sc.next();
                for(int i=0;i<bookarray.length;i++){
                    if(new_title.equals(bookarray[i].title)){
                        bookarray[i].Rating();
                    }
                    else{
                        System.out.println("The book is not available");
                    }
                }
                break;


        }
    }
}
class Store{
    String title;
    String author;
    int price;
    int qty;
    int rate;
    Scanner sc=new Scanner(System.in);
    public void Getbooks(){
        System.out.println("enter book name:");
        title=sc.nextLine();
        System.out.println("Enter the author of book");
        author=sc.nextLine();
        System.out.println("Enter price of book: ");
        price=sc.nextInt();
        System.out.println("Enter quantity of book");
        qty=sc.nextInt();
    }
    public void Rating(){
        System.out.println("Enter your rating for a book between 1 to 5");
        rate=sc.nextInt();
    }

}