import java.util.Scanner;
import java.lang.String;

class Book {
    private String title;
    private String author;
    private boolean isLent;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isLent = false; // Book is not lent out initially
    }

    public String getTitle() {
        return title;
    }

    public void lend() {
        if (!isLent) {
            isLent = true; // Mark as lent
            System.out.println("You have lent: " + title);
        } else {
            System.out.println("Book is already lent out.");
        }
    }

    public void returnBook() {
        if (isLent) {
            isLent = false; // Mark as available
            System.out.println("You have returned: " + title);
        } else {
            System.out.println("This book was not lent out.");
        }
    }

    public boolean isLent() {
        return isLent; // Check if book is lent
    }

    @Override
    public String toString() {
        return title + " by " + author + (isLent ? " (Lent out)" : " (Available)");
    }
}

     class Library {
        private static Book[] books = new Book[5]; // Fixed-size array for books
        private static int bookCount = 0; // Count of added books

        public static void addBook(Book book) {
            if (bookCount < books.length) {
                books[bookCount] = book; // Add book to the array
                bookCount++;
                System.out.println("Added: " + book.getTitle());
            } else {
                System.out.println("Library is full! Cannot add more books.");
            }
        }

        public static void displayBooks() {
            System.out.println("\nLibrary Books:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]); // Show all books
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            addBook(new Book("1984", "George Orwell"));
            addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

            while (true) {
                System.out.println("Add a Book");
                System.out.println("\n1. Display Books");
                System.out.println("2. Lend a Book");
                System.out.println("3. Return a Book");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear the newline character

                switch (choice) {
                    case 1:
                        addBook("Atomic Habits");
                        break;
                    case 2:
                        displayBooks(); // Show all books
                        break;
                    case 3:
                        System.out.print("Enter book title to lend: ");
                        String lendTitle = scanner.nextLine();
                        for (int i = 0; i < bookCount; i++) {
                            if (books[i].getTitle().equalsIgnoreCase(lendTitle)) {
                                books[i].lend(); // Lend the book
                                break;
                            }
                        }
                        break;
                    case 4:
                        System.out.print("Enter book title to return: ");
                        String returnTitle = scanner.nextLine();
                        for (int i = 0; i < bookCount; i++) {
                            if (books[i].getTitle().equalsIgnoreCase(returnTitle)) {
                                books[i].returnBook(); // Return the book
                                break;
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Exiting.");
                        scanner.close(); // Close scanner
                        return; // Exit the program
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

