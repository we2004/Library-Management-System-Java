
package librarysystemproject;

class FictionBook extends Book {
    private String genre;
    FictionBook() {}
    FictionBook(String name, double price, String author,String genre) {
        super(name,price, author);
        this.genre = genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
        
    }
    
    public String getGenre() {
        return this.genre;
    }
    
    @Override
    public String toString() {
        return """
               
                Title   : %s
                Author  : %s
                Genre   : %s
                Price   :%.2f
                Catagory:%s
               
                """.formatted(this.getName(),this.getAuthor(),this.genre,this.getPrice(),"Fiction");
    }
} 
