//An applet to print Hello World

import java.applet.Applet;
import java.awt.Graphics;
 public class HelloWorld extends Applet{        //extend is used to take Applet
 public void paint (Graphics  g){               //paint is a method
 g.drawString("HelloWorld",200,200);       //g.drawString is a method for graphics and 150 is coordinates
 }
 }