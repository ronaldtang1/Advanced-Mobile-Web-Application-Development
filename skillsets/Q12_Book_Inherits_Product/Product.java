import java.text.DecimalFormat;

public class Product {
    private String code;
    private String description;
    private double price;

    public Product() {
        code = "abc123";
        description = "My widget";
        price = 49.99;
    }//end default constructor

    public Product(String c, String d, double p){
        code = c;
        description = d;
        price = p;
    }//end parameter constructor

    public void setCode(String code) {
        this.code = code;
    }//end setCode

    public void setDescription(String description) {
        this.description = description;
    }//end setDescription

    public void setPrice(double price) {
        this.price = price;
    }//end setPrice

    public String getCode() {
        return code;
    }//end getCode

    public String getDescription() {
        return description;
    }//end getDescription

    public double getPrice() {
        String formatted = String.format("%.2f", price);
        return Double.parseDouble(formatted);
    }//end getPrice

    public void print() {
        System.out.printf("Code: %s, Description: %s, Price: $%.2f\n", getCode(), getDescription(), getPrice());
    }//end print
}//end class