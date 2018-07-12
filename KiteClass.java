//the KiteClass Class
import hsa.Console;
import java.awt.*;
class KiteClass
    {
    private int iWidth ;
    private int iHeight;
    private int iCentreX ;
    private int iCentreY ;
    private Color cColor ;

    private int StringDirection;
    private int RotateDirection;
    private boolean filled ;
       
    
    
    public KiteClass()
    {
	 int iWidth = 80;
     int iHeight = 100;
     int iCentreX = 100;
     int iCentreY = 100;
     Color cColor = Color.red;
     int StringDirection = 1;
     int RotateDirection = 1;

   
    }
    public void setWidth (int iNewWidth)
    {
	iWidth = iNewWidth;
    }


    public void setHeight (int iNewHeight)
    {
	iHeight = iNewHeight;
    }


    public void setCenter (int iNewCentreX, int iNewCentreY)
    {
	iCentreX = iNewCentreX;
	iCentreY = iNewCentreY;
    }


    public void setColor (Color cNewColor)
    {

	cColor = cNewColor;
    }

    public void setStringDirection (int stringDirection)
    {
    StringDirection = stringDirection;
    } 
    public void setRotateDirection ( int rotateDirection)
    {
    RotateDirection = rotateDirection;
    }
    public int getStringDirection ()
    {
    return StringDirection;
    }
    public int getRotateDirection ()
    {
    return RotateDirection;
    }
    public int getWidth ()
    {
	return iWidth;
    }


    public int getHeight ()
    {
	return iHeight;
    }


    public int getCenterX ()
    {
	return iCentreX;
    }


    public int getCenterY ()
    {
	return iCentreY;
    }


    public Color getColor ()
    {
	return cColor;
    }


    public void setIsFilled (boolean newfilled)
    {
	filled = newfilled;
    }


    public boolean getIsFilled ()
    {
	return filled;
    }











public void draw (Console c)
    {
	// declare two arrays for X & Y coordinates of Diamond
	int iPointsX[] = new int [4];
	int iPointsY[] = new int [4];

	// calculate points on diamond & store in the arrays
	iPointsX [0] = iCentreX - iWidth / 2;
	iPointsY [0] = iCentreY;
	iPointsX [1] = iCentreX;
	iPointsY [1] = iCentreY - iHeight / 2;
	iPointsX [2] = iCentreX + iWidth / 2;
	iPointsY [2] = iCentreY;
	iPointsX [3] = iCentreX;
	iPointsY [3] = iCentreY + iHeight / 2;

	// draw the diamond using methods available from the Console object (c)
	c.setColor (cColor);
	if (filled)
	{
	    c.fillPolygon (iPointsX, iPointsY, 4);
	}
	else
	{
	    c.drawPolygon (iPointsX, iPointsY, 4);
	}
	if (StringDirection == 1){
	    c.drawLine (iPointsX[2],iCentreY,iPointsX[2]+10,iCentreY);
	}
	if (StringDirection == 2){
	   c.drawLine (iCentreX,iPointsY[3],iCentreX,iPointsY[3]+10);
	}
	if (StringDirection == 3){
	c.drawLine (iPointsX[0],iCentreY,iPointsX[0]-10,iCentreY);
	}
	if (StringDirection == 4){
	c.drawLine (iCentreX,iPointsY[1],iCentreX,iPointsY[1]-10);
	}
	
	
    }
      public void delay (int iDelayTime)
    {    
    long lFinalTime = System.currentTimeMillis () + iDelayTime;
	do
	{
	} while (lFinalTime >= System.currentTimeMillis ());
    }
    
    public void draw (Graphics g)
    {
	// declare two arrays for X & Y coordinates of Diamond
	int iPointsX[] = new int [4];
	int iPointsY[] = new int [4];

	// calculate points on diamond & store in the arrays
	iPointsX [0] = iCentreX - iWidth / 2;
	iPointsY [0] = iCentreY;
	iPointsX [1] = iCentreX;
	iPointsY [1] = iCentreY - iHeight / 2;
	iPointsX [2] = iCentreX + iWidth / 2;
	iPointsY [2] = iCentreY;
	iPointsX [3] = iCentreX;
	iPointsY [3] = iCentreY + iHeight / 2;

	// draw the diamond using methods available from the Console object (c)
	g.setColor (cColor);
	if (filled)
	{
	    g.fillPolygon (iPointsX, iPointsY, 4);
	}
	else
	{
	    g.drawPolygon (iPointsX, iPointsY, 4);
	}
	if (StringDirection == 1){
	    g.drawLine (iPointsX[2],iCentreY,iPointsX[2]+10,iCentreY);
	}
	if (StringDirection == 2){
	   g.drawLine (iCentreX,iPointsY[3],iCentreX,iPointsY[3]+10);
	}
	if (StringDirection == 3){
	g.drawLine (iPointsX[0],iCentreY,iPointsX[0]-10,iCentreY);
	}
	if (StringDirection == 4){
	g.drawLine (iCentreX,iPointsY[1],iCentreX,iPointsY[1]-10);
	}
	
	
    }
  
    public void erase (Console c)
{
    Color cOldColor = getColor ();
    setColor (Color.white);
    draw (c);
    setColor (cOldColor);
}
public void rotate (Console c)
    {
if (RotateDirection==1){
	int Height;
	Height = iWidth;
	int Width;
	Width = iHeight;
	iHeight=Height;
	iWidth=Width;
	}

	
	
      }
    public void erase (Graphics g)
{
    Color cOldColor = getColor ();
    setColor (Color.white);
    draw (g);
    setColor (cOldColor);
}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

