
import java.applet.Applet;
import java.awt.Graphics;
 
public class firstApplet extends Applet
{
    
    @Override
    public void paint(Graphics g)
    {
        g.drawString("Hello World", 20, 20);
        //g.background(g.color.RED);
       // setBackground(g.Color.RED);
    }
     
}
