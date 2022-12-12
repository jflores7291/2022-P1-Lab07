import java.awt.*;
import java.applet.*;
public class Front {
    public static void drawFloors(Graphics g){
        //Floor one:
        g.setColor(Color.darkGray);
        g.fillRect(400,400,250,100);
        //Floor two:
        g.setColor(Color.lightGray);
        g.fillRect(400,300,250,100);
        //Floor three
        g.setColor(Color.darkGray);
        g.fillRect(400,200,250,100);
        //Floor four
        g.setColor(Color.lightGray);
        g.fillRect(400,100,250,100);

    }
    public static void drawWindows(Graphics g){
        //Square frame
        g.setColor(Color.black);
        g.drawRect(435,430,35,35);
        //Frame one
        g.drawLine(435,448,452,448);
        //Frame two
        g.drawLine(452,448,470,448);
        //Frame three
        g.drawLine(453,430,453,448);
        //Frame four
        g.drawLine(453,448,453,465);

        //Square frame
        g.setColor(Color.black);
        g.drawRect(575,430,35,35);
        //Frame one
        g.drawLine(575,448,593,448);
        //Frame two
        g.drawLine(593,448,610,448);
        //Frame three
        g.drawLine(593,430,593,448);
        //Frame four
        g.drawLine(593,448,593,465);

    }
    public static void drawDoor(Graphics g){
        //Whole Door
        g.setColor(Color.blue);
        g.fillRect(500,429,50,70);
        //Door knob
        g.setColor(Color.black);
        g.fillRect(535,465,5,5);
    }

}
