
package guiexp;

import java.awt.Color;
import java.awt.Font;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GuiExp {


    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:/Users/TITAN/Documents/NetBeansProjects/guiExp/src/guiexp/articulated.png");

        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.yellow, 2);
        
        JFrame frame = new JFrame();
        frame.setTitle("Carp are Delicious"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application when window is closed
        frame.setResizable(true); //prevent frame from being resized
        //frame.setSize(500,500); //sets the dimensions of the frame (x,y)
        //frame.setLayout(null);
        frame.setVisible(true); //makes frame visible

        frame.getContentPane().setBackground(new Color(240,140,220)); //sets color of background
        
        JLabel label = new JLabel();//creates label
        label.setText("Carp fully restores HP"); //set text to label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //consider position of the text horizontally
        label.setVerticalTextPosition(JLabel.TOP);//consider vertical position of text
        label.setForeground(new Color(200,200,200)); //sets text color
        label.setFont(new Font("Arial Black",Font.PLAIN,20)); //sets font
        label.setIconTextGap(-25); //set gap of text to image
        label.setBackground(Color.black);
        label.setOpaque(true); //Displays background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//sets vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER);//sets horizontal position "" ""
        //label.setBounds(JLabel.CENTER, JLabel.CENTER, 250, 250);//sets x,y position within frame as well as dimensions
        
        frame.add(label);
        frame.pack(); //packs all components and resizes to fit them in the frame

       
    }
    
}
