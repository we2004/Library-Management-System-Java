
package librarysystemproject;

class NonFictionBook extends Book {
    NonFictionBook() {}
    NonFictionBook(String name, double price, String author) {
        super(name,price, author);
    }
    
    @Override
    public String toString() {
        return """
               
                Title   : %s
                Author  : %s
                Price   :%.2f
                Catagory:%s
               
                """.formatted(this.getName(),this.getAuthor(),this.getPrice(),"Non-Fiction");
    }
} 
