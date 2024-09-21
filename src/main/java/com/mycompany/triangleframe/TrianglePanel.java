
package com.mycompany.triangleframe;

import javax.swing.*;
import java.awt.*;


/**
 * 
 * @author Aaliyah M
 * TrianglePanel recursively draws the triangle on the frame
 * Calculates the width and height of the frame so that it adjusts when the user 
 * expands the window.
 * 
 */
public class TrianglePanel extends JPanel{
    
    private TriangleFrame frame;

    
    public TrianglePanel(TriangleFrame tf) {
        frame = tf;
    }
    
    public void draw(Graphics g, int x, int y, int width) {
           
        if (width == 1) {
            g.drawRect(x, y, 1, 1);
        }
        else {
            draw(g,x,y+width/2,width/2);
            draw(g,x+width/2,y+width/2,width/2);
            draw(g,x+width/4,y,width/2);
        }    
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  
        if (getHeight() < getWidth()) {
            draw(g,0,0,getHeight());
        }
        else {
            draw(g,0,0,getWidth());
        }
        
    }
           
}
