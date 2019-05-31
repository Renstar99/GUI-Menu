
package ui.menu;
import javax.swing.*;
import java.awt.*;

public class UIMenu {
   
    public static void main(String[] args) {
       
        //Creating the frame
        JFrame frame = new JFrame("GUI Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
       
        //Creating the panels 
        JPanel panel = new JPanel();
        JButton encode = new JButton("Encode a message");
        JButton decode1 = new JButton("Decode a message");
        JButton decode2 = new JButton("Decode a image");
        JButton exit = new JButton("Exit");
        panel.add(encode);
        panel.add(decode1);
        panel.add(decode2);
        panel.add(exit);
        
        // Add the components to the frame
        frame.getContentPane().add(BorderLayout.WEST,encode);
        frame.getContentPane().add(BorderLayout.EAST,decode1);
        frame.getContentPane().add(BorderLayout.CENTER, decode2);
        frame.getContentPane().add(BorderLayout.SOUTH, exit);
        frame.setVisible(true);
    }
    
}
