import java.awt.*;

import javax.swing.*;
public class Mainframe extends JFrame
{
    final private Font mainfont = new Font("Segoe print", Font.BOLD,18);
    JTextField tfFirstName, tfLastName;

    public void initialize()
    {
        JLabel ibFirstName=new JLabel("First Name");
        ibFirstName.setFont(mainfont);

        tfFirstName=new JTextField();
        tfFirstName.setFont(mainfont);


        JLabel ibLastName=new JLabel("Last Name");
        ibLastName.setFont(mainfont);

        tfLastName=new JTextField();
        tfLastName.setFont(mainfont);

      


        
 

        setTitle("Welcome");
        setSize(500,600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
