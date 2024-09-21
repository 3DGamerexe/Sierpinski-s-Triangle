
package com.mycompany.triangleframe;

import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author Aaliyah M
 * Using a Frame and Panel, recursively create Sierpinski's Triangle.
 * TriangleFrame creates a new frame where the triangle will display.
 * 
 */
public class TriangleFrame extends JFrame {
    
    TrianglePanel panel;
    
    public TriangleFrame() {
        setTitle("Sierpinski's Triangle");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();   
        setSize(screenSize.width, screenSize.height);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new TrianglePanel(this);
        add(panel);              
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new TriangleFrame();
    }
}
