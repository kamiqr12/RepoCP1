/**
 * The drawing is of a picture from a concert.
 *
 * @author (Kamila Rojas)
 * @version (January 22, 2019)
 */


import java.awt.*;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;

public class bts extends JComponent{

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.magenta);

        // x coordinates of vertices
        int x[] = { 50, 100, 100, 50, 50 };
        // y coordinates of vertices
        int y[] = { 50, 100, 175, 225, 50 };
        // number of vertices
        int numberofpoints = 4;
        
        // set the color of line drawn
        g2.setColor(Color.magenta);
    
        // draw the polygon using drawPolygon function
        g2.fillPolygon(x, y, numberofpoints);
        
        // second screen
        int a[] = { 300, 250, 250, 300, 300 };
        // y coordinates of vertices
        int b[] = { 50, 100, 175, 225, 50 };
        // number of vertices
        int umberofpoints = 4;
        
        // set the color of line drawn to blue
        g2.setColor(Color.magenta);
        
        // draw the polygon using drawPolygon function
        g2.fillPolygon(a, b, numberofpoints);
        
        // mini wing
        int d[] = { 150, 175, 175, 150, 150 };
        // y coordinates of vertices
        int e[] = { 100, 125, 175, 200, 100 };
        // number of vertices
        int amountofpoints = 4;
        
        // set the color of line drawn to blue
        g2.setColor(Color.magenta);
        
        // draw the polygon using drawPolygon function
        g2.fillPolygon(d, e, numberofpoints);
        
        // second mini wing
        int f[] = { 200, 175, 175, 200, 200 };
        // y coordinates of vertices
        int h[] = { 100, 125, 175, 200, 100 };
        // number of vertices
        int quantityofpoints = 4;
        
        // set the color of line
        g2.setColor(Color.magenta);
        
        // draw the polygon using drawPolygon function
        g2.fillPolygon(f, h, numberofpoints);
        
        // stage
        int xPoly[] = { 75, 275, 275, 200, 200, 150, 150, 75, 75  };
        int yPoly[] = { 200, 200, 225, 225, 325, 325, 225, 225, 200 };
        
        g2.setColor(Color.black);
        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        g2.fill(poly);
        
        // circles
        g2.setColor(Color.red);
        g2.drawOval(100, 250,  3, 3);
        g2.fillOval(100, 250, 3, 3);
        
        g2.setColor(Color.blue);
        g2.drawOval(100, 250,  3, 3);
        g2.fillOval(250, 250, 3, 3);
        
        g2.setColor(Color.green);
        g2.drawOval(100, 250,  3, 3);
        g2.fillOval(175, 350, 3, 3);
        

        
    }
}
    
        
        
        
        
        
        
        
        

