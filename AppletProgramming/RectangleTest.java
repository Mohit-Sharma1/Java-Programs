//Use of init()method in applet
import java.applet.*;
import java.awt.*;
 public class RectangleTest extends Applet{
 	int x,y,w,h;
 	public void init(){
 		x=Integer.parseInt(getParameter("xValues"));
 		y=Integer.parseInt(getParameter("yValues"));
 		w=Integer.parseInt(getParameter("wValues"));
 		h=Integer.parseInt(getParameter("hValues"));
 	}
 	public void paint(Graphics g){
 		g.drawRect(x,y,w,h);         //draw is used 
 	}
 }