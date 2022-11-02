import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        String code = "";
        String description = "";
        double price = 0.0;
        String author = "";
        Scanner scnr = new Scanner(System.in);

        System.out.println("/////Below  are *base class default constructor* values (instantiating p1, then using getter methods)://///");
        Product p1 = new Product();
        System.out.println("Code = " + p1.getCode());
        System.out.println("Description = " + p1.getDescription());
        System.out.println("Price = $" + p1.getPrice());
        System.out.println();

        System.out.println("/////Below are *base class* user-entered values (instantiating p2, then using getter methods)://///\n");
        System.out.print("Code: ");
        code = scnr.next();
        scnr.nextLine();

        System.out.print("Description: ");
        description = scnr.nextLine();

        System.out.print("Price: ");
        price = scnr.nextDouble();
        scnr.nextLine();

        Product p2 = new Product(code, description, price);
        System.out.println("Code = " + p2.getCode());
        System.out.println("Description = " + p2.getDescription());
        System.out.println("Price = $" + p2.getPrice());

        System.out.println("\n/////Below uses setter methods to pass literal values to p2, then print() method to display values://///\n");
        p2.setCode("xyz789");
        p2.setDescription("Test widget");
        p2.setPrice(89.99);
        p2.print();
        System.out.println();
        
        System.out.println("\n/////Below are *derived class default constructor* values (instantiating b1, then using getter methods)://///\n");
        Book b1 = new Book();
        System.out.println("Code = " + b1.getCode());
        System.out.println("Description = " + b1.getDescription());
        System.out.println("Price = $" + b1.getPrice());
        System.out.println("Author = " + b1.getAuthor());

        System.out.println("\nOr using overridden derived class print() method...\n");
        b1.print();

        System.out.println("\n/////Below are *derived class* user-entered values (instantiating b2, then using getter methods)://///\n");
        System.out.print("Code: ");
        code = scnr.next();
        scnr.nextLine();

        System.out.print("Description: ");
        description = scnr.nextLine();

        System.out.print("Price: ");
        price = scnr.nextDouble();
        scnr.nextLine();

        System.out.print("Author: ");
        author = scnr.nextLine();

        Book b2 = new Book(code, description, price, author);
        System.out.println("Code = " + b2.getCode());
        System.out.println("Description = " + b2.getDescription());
        System.out.println("Price = $" + b2.getPrice());
        System.out.println("Author = " + b2.getAuthor());
        System.out.println();

        System.out.println("Or using derived class print() method...\n");
        b2.print();
    }//end main
}//end class
