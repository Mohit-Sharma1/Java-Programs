/* To check the init method*/
import java.applet.Applet;
import java.awt.Graphics;
 public class Demonstration_23 extends Applet{

   public void init(){
   
   /* To resize an applet window use
   *void resize(int x,int y) method of an applet class
   * resize file is always is in the Applet file also
   */
   
   resize(500,500);
   }
   
   public void paint(Graphics g){
   g.drawString("Window has been resized to 300,300",50,50);
   }
 }