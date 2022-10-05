import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PaintCalculator{
    public static void main (String[] args){
        //initialize variables and create GUI objects
        String paintCostString = "", lengthString = "", widthString = "", heightString = "";
        double paintCost = 0.0, length = 0.0, width = 0.0, height = 0.0, area = 0.0, total = 0.0, gallons = 0.0;
        final int SQFT_PER_GAL = 350;

        DecimalFormat moneyFormat = new DecimalFormat("$#,###,##0.00");
        DecimalFormat numberFormat = new DecimalFormat("#,###,##0.00");

        JOptionPane.showMessageDialog(null, 
                            "Program uses Java GUI message and input dialogs.\n" + 
                            "Program determines paint cost per room (i.e., \"area\").\n" +
                            "For paint \"area\" simplicity: use length X height X 2 + width X height X 2.\n" +
                            "Format numbers as per below: thousand separator, decimal point and $ sign for currency.\n" +
                            "Research how many square feet a gallon of paint covers.\n" +
                            "Note: Program performs data validation.");

        paintCostString = JOptionPane.showInputDialog(null, 
                            "Paint price per gallon:",
                            "Paint Cost Calculator",
                            JOptionPane.INFORMATION_MESSAGE);

        paintCost = Double.parseDouble(paintCostString);

        lengthString = JOptionPane.showInputDialog(null, "Length:", "Paint Cost Calculator", JOptionPane.INFORMATION_MESSAGE);
        length = Double.parseDouble(lengthString);

        widthString = JOptionPane.showInputDialog(null, "Width:", "Paint Cost Calculator", JOptionPane.INFORMATION_MESSAGE);
        width = Double.parseDouble(widthString);

        heightString = JOptionPane.showInputDialog(null, "Height:", "Paint Cost Calculator", JOptionPane.INFORMATION_MESSAGE);
        height = Double.parseDouble(heightString);

        area = (length * height / 2) + (width * height * 2);
        gallons = area / SQFT_PER_GAL;
        total = gallons * paintCost;

        JOptionPane.showMessageDialog(null, 
                                "Paint =  "
                                + moneyFormat.format(paintCost)
                                + " per gallon.\nArea of room = "
                                + numberFormat.format(area)
                                + "sq ft.\nTotal = "
                                + moneyFormat.format(total));
    }
}