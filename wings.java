 import javax.swing.JFrame;

public class wings
{
    public static void main(String[] args){
	
	// You should change the Title
        JFrame frame = new JFrame("Frame for Picture");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bts picture = new bts();
        frame.add(picture);
        
        frame.setVisible(true);
    }
}
