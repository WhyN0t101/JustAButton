
package testgui;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame {
    
    JButton button; 
    JLabel label;
    
    
    
    MyFrame(){     
        
         //ImageIcon icon2 = new ImageIcon("");
                
        
        
         //label = new JLabel();
         //label.setIcon(icon2);
         //label.setBounds(150, 250, 150, 150);
         //ImageIcon icon = new ImageIcon("‪ImageLocal");
         button = new JButton();
         button.setBounds(125,100,250,100);
         button.addActionListener(e -> System.out.println("Hi"));
         button.setText("Click Me");
         button.setFocusable(false);
         //button.setIcon(icon);
         //button.setHorizontalTextPosition(JButton.CENTER);
         //button.setVerticalTextPosition(JButton.BOTTOM);
         button.setFont(new Font("Comic Sans",Font.BOLD,20));
         button.setIconTextGap(-15);
         button.setForeground(Color.cyan);
         button.setBackground(Color.lightGray);
         button.setBorder(BorderFactory.createEtchedBorder());
       
         
         
       this.setTitle("Test Gui"); // Titulo
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Action of the button on close
       this.setResizable(false); //Doesnt allow window to be resized
       this.setSize(500,500); // Window Size
       this.setVisible(true);
       this.add(button);
       this.setLayout(null);
       ImageIcon image = new ImageIcon("ImageLocal");
       this.setIconImage(image.getImage()); //Changes the icon of the window
       this.getContentPane().setBackground(new Color(123,50,250)); // back ground color
       //this.add(label);
       
       
     }
     
}
