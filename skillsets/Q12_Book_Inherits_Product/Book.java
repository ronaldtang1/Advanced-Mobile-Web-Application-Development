public class Book extends Product{
    private String author;

    public Book() {
        super();
        System.out.println("Inside book default constructor.\n");
        author = "John Doe";
    }//end default constructor
    
    public Book(String code, String description, double price, String author) {
        super(code, description, price);
        System.out.println("Inside book constructor with parameters.\n");
        this.author = author;
    }//end constructor with parameters

    public void setAuthor(String author){
        this.author = author;
    }//end setAuthor
    
    public String getAuthor(){
        return author;
    }//end getAuthor

    public void print() {
        super.print();
        System.out.printf(", Author: %s\n", getAuthor());
    }//end print
}