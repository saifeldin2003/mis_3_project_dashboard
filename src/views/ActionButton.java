/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Saif Eldin
 */
public class ActionButton extends JButton{
    boolean mousepressed;
    public ActionButton(){
        setContentAreaFilled(false);
        setBackground(Color.blue);
        setBorder(new EmptyBorder(3,3,3,3));
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                mousepressed=true;
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                mousepressed=false;
            }
        });
        
    }
/*
    @Override
    protected void paintComponent(Graphics g) {
 
        Graphics2D g2 =  (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        int size = Math.min(w, h);
        int x = (w-size)/2;
        int y = (h-size)/2;
        if(mousepressed){
            // mouse is pressed
        g2.setColor(new Color(158,158,158));
        }else{
            // mouse is is  pressed
        g2.setColor(new Color(199,199,199));
        }
        g2.fill(new Ellipse2D.Double(x,y,size,size));
        g2.dispose();
        //this.paintAll(g);
        super.paintComponent(g2); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
*/

   
    
    
}
