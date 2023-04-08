import java.util.Scanner;

class book{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    book(){
        this(null,null,null,null,0,0.0,0);
    }
    book(String title,String author,String publisher,String isbn,int year,double price,int quantity){
        this.title = title;
        this.author=author;
        this.isbn = isbn;
        this.publisher=publisher;
        this.year=year;
        this.price = price;
        this.quantity = quantity;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(){
        this.quantity = quantity+1;
    }
    public void decreaseQuantity(){
        this.quantity = quantity-1;
    }

    public void getInventoryValue(){
        System.out.println("Total inventory value is : "+ (this.quantity*this.price));
    }


    
}

public class Program2_3 {
    public static void main(String[] args) {
        book b1 = new book();
        b1.setTitle("Let us c");
        b1.setAuthor("Kanetkar sir");
        b1.setPublisher("techMax");
        b1.setQuantity(4);
        b1.setYear(2000);
        b1.setPrice(320);

        b1.increaseQuantity();

        b1.getInventoryValue();

        b1.decreaseQuantity();
        
    }
}
