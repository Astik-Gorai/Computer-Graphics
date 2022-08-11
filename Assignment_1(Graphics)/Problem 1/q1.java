import java.util.*;
import java.applet.Applet;
import java.awt.*;

public class q1 extends Applet{
   public void paint(Graphics g){
        // g.drawLine(x1,y1,x2,y2);
        setBackground(Color.GRAY);
        // draw the first line
        int y1 = getHeight()/2;
        int x1 =0;
        int x2 = getWidth();
        int y2 = y1;
        g.drawLine(x1,y1,x2,y2);
        // draw the second line
        int x3 = getWidth()/2;
        int x4=x3;
        int y3 = 0;
        int y4 = getHeight();
        g.drawLine(x3,y3,x4,y4);
    }
}