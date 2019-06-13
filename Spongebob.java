import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Spongebob extends JComponent
{
    public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
        	g2.setColor(Color.yellow);

		Rectangle head = new Rectangle(100, 100, 100, 100);
		g2.fill(head);
                g2.draw(head);




   	// comment this out once you have finished
        drawGrid(g2);
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
    }
}
		