//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Demo extends Canvas
{
   public Demo()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //window.setColor(Color.GREEN);
      //window.drawRect( 210, 100, 400, 400 );
      //window.fillRect( 210, 100, 400, 400 );

      //window.setColor(Color.YELLOW);
      //window.drawOval( 210, 100, 400, 400 );
      //window.fillOval( 210, 100, 400, 400 );

      //window.setColor(Color.MAGENTA);
      //window.drawLine( 210, 100, 400, 400 );

      //window.setColor(Color.BLUE);
      //window.drawString("Computer Sciuence!", 35, 35);
   }
}