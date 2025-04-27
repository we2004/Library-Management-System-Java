
package librarysystemproject;
import java.util.Scanner;
import java.util.ArrayList;

public class LibrarySystemProject  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library lib = new Library();
        ArrayList<Book> bookList = new ArrayList<>();
        int option = 0;
        final String LIST = """
                            
                            1. Add a Book
                            2. Remove a Book
                            3. Search a Book by Title
                            4. Display All Books
                            5. Exit
                            
                            """;
      
        System.out.println("Welcome to the Library System!");
        do {
            System.out.println(LIST);
            System.out.print("Please choose an option: ");
            option = input.nextInt();
            input.nextLine();
            
            switch(option) {
                case 1 -> {
                    Book book;
                    
                    
                    System.out.print("Enter book title: ");
                    String title = input.nextLine();
                    System.out.print("Enter author name: ");
                    String author = input.nextLine();
                    System.out.print("Enter price: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    System.out.print("Is it fiction? (1 for yes 0 for no): ");
                    int answer = input.nextInt();
                    input.nextLine();
                    boolean isFiction = (answer==1);
                    if(isFiction) {
                        System.out.print("Enter genre: ");
                        String genre = input.nextLine();
                        book = new FictionBook(title,price,author,genre);
                    }
                    
                    else {
                        book = new NonFictionBook(title,price,author);
                    }
                       
                    
                    lib.addBook(book);
                }
                case 2 -> {
                    System.out.print("Enter the title of the book you want to remove: ");
                    String title = input.nextLine();
                    if(lib.removeBook(title))
                        System.out.println("The book "+title+" has been successfully removed from the library!");
                    else
                        System.out.println("Failed to remove!!");
                    
                }
                case 3 -> { 
                    System.out.print("Enter the title to search: ");
                    String title = input.nextLine();
                    System.out.println(lib.searchForBook(title)?"Book found!":"Book not found!");
                    if(lib.searchForBook(title)) {
                        System.out.print("Do you want to display the book? (1 for yes 0 for no): ");
                        int answer = input.nextInt();
                        if(answer==1)
                            System.out.println(lib.displayBook(title));
                        
                            
                    }
                }
                case 4 -> System.out.println(lib.displayLibrary());
                case 5 -> System.out.println("Thank you for visiting the library!!");
                default -> System.out.println("Invalid option!!!");
            }
            
        }while(option != 5);
    }
    
}
