
package librarysystemproject;

public class Book {
    private String name;
    private double price;
    private String author;
    
    Book() {
        this("undefined",0.00,"undefined");
    }
    Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        
        return this.name;
    }
    
    public void setPrice(double price) {
        this.price =price;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    @Override
    public String toString() {
        return """
               Title = %s
               Author = %s
               Price = %.2f
               """.formatted(this.name,this.author,this.price);
    }
}
