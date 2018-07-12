//UseKiteClass
import java.awt.*;
import hsa.Console;

public class UseKiteClass
{
public static void main (String[] args)
    {
     // Place your code here
	    // Instatiate the console object
	Console c = new Console ();

	//Instantiate 2 DiamondClass objects objects
	KiteClass d1 = new KiteClass ();
	KiteClass d2 = new KiteClass ();

		 d1.setCenter (200, 200);
	d1.setHeight (150);
	d1.setWidth (50);
	d1.setColor (Color.blue);
	
	d1.setRotateDirection(1);
for (int i=1;1<5;i++)
{
d1.setStringDirection(i);
d1.draw(c);

d1.delay(500);
d1.erase(c);
d1.rotate(c);

}






}
}
