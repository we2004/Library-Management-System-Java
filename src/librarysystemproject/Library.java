
package librarysystemproject;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> bookList;
    Library(){
        bookList = new ArrayList<>();
    }
    Library(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    Library(Book book) {
        bookList = new ArrayList<>();
        this.bookList.add(book);
    }
    
    public boolean removeBook(String name) {
    
            for(int i = 0;i<this.bookList.size();i++) {
                if(this.bookList.get(i).getName().equalsIgnoreCase(name)) {
                   this.bookList.remove(i);
                    return true;
                }
            }
        
        
        return false;
    }
    
    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    
    public ArrayList<Book> getBookList() {
        return this.bookList;
    }
    
    public void addBook(Book book) {
        this.bookList.add(book);
        
    }
    
    public String displayBook(String name) {
        for(Book book : this.bookList) {
            if(book.getName().equalsIgnoreCase(name))
                return book.toString();
        }    
        return "Book not found!!!";
    }
    
     
    public String displayLibrary() {
        if(this.bookList.size() == 0)
            return "library is empty!!";
        
        StringBuilder lib = new StringBuilder();
        lib.append("The Library:\n");
        for(Book book : this.bookList) {
            lib.append(book.toString());
        }
        
        return lib.toString();
    }
    
    public boolean searchForBook(String name) {
        for(Book book : this.bookList) {
            if(book.getName().equalsIgnoreCase(name))
                return true;
        }
        
        return false;
    }
    
   
}
