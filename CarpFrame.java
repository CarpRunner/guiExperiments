package guiexp;

import java.awt.Color;
import javax.swing.JFrame;

public class CarpFrame extends JFrame{
    
    CarpFrame(){
        
        
        this.setTitle("Carp are Delicious"); //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application when window is closed
        this.setResizable(false); //prevent this from being resized
        this.setSize(500,500); //sets the dimensions of the this (x,y)
        this.setVisible(true); //makes this visible
        
        this.getContentPane().setBackground(new Color(240,140,220)); //sets color of background
    }
    
}
