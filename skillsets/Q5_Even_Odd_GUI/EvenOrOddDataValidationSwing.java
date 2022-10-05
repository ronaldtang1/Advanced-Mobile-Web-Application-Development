import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Swing GUI application inherits from top-level container javax.swing.JFrame
public class EvenOrOddDataValidationSwing extends JFrame
{
    private JTextField jT;  //Swing's JTextField
    private JButton jB;     //Swing's JButton
    private JLabel jL;      //Swing's JLabel

    public EvenOrOddDataValidationSwing()
    {
    //Retrieve content-pane of top-level container JFrame
    //All operations done on content-pane
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());     //content-pane sets its layout
    cp.setBackground(Color.lightGray);

    cp.add(new JLabel("Enter:"));
    jT = new JTextField("0");
    jT.setColumns(2);
    jT.setBackground(Color.BLUE);
    jT.setForeground(Color.cyan);
    jT.setEditable(true);
    cp.add(jT);

    jB = new JButton("Evaluate");
    cp.add(jB);

    jL=new JLabel();
    jL.setOpaque(true);
    cp.add(jL);

    //Allocate an anonymous instance of an anonymous inner class that 
    //implements ActionListener as ActionEvent listener
    jB.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent evt)
        {
            String str = jT.getText();

            if (str.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Invalid integer. Please enter integer.", "Error", JOptionPane.ERROR_MESSAGE);
                jT.requestFocusInWindow();
            }
            else if (!isNumber(str))
            {
                JOptionPane.showMessageDialog(null, "Invalid integer. Please enter integer.", "Error", JOptionPane.ERROR_MESSAGE);
                jT.requestFocusInWindow();
            }
            else{
                int num = Integer.parseInt(str);
                jL.setBackground(Color.gray);
                jL.setForeground(Color.pink);
                if (num % 2 == 0)
                {
                    jL.setText(num + " is an even number.");
                }
                else
                {
                    jL.setText(num + " is an odd number");
                }
            }
        }
    });

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //Exit program if close-window button clicked
    setTitle("Even or Odd");
    setSize(220, 100);
    setVisible(true);
    }

    private static boolean isNumber(String n){
        try
        {
            Integer.parseInt(n);
            return true;
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
    }

    public static void main (String[] args)
    {
        //Run GUI construction in Event-Dispatching thread for thread-safety
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run()
            {
                new EvenOrOddDataValidationSwing(); //invoke contructor
            }
        });
    }
}