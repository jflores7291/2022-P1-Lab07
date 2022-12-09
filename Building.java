import java.awt.*;
import java.applet.*;
public class Building extends Applet{
    public void paint(Graphics g){
        Front.drawFloors(g);
        Front.drawWindows(g);
        Front.drawDoor(g);

    }
}
