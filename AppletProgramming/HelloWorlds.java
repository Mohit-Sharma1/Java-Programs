//Use of init()method in applet
import java.applet.Applet;
import java.awt.Graphics;
 public class HelloWorlds extends Applet{ 
 	public void init(){
 		resize(200,200);                           //resize method call
 	}
 	public void paint(Graphics g){
 		g.drawString("HelloWorld",150,150);
 	}
 }