package Unit_15;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.*;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)  {
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball (int x, int y, int w, int h) {
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball (int x, int y, int w, int h, Color c) {
		super(x,y,w,h,c);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball (int x, int y, int w, int h, Color c, int xs, int ys) {
		super(x,y,w,h,c);
		xSpeed = xs;
		ySpeed = ys;
	}

   //add the set methods

	public void setXSpeed(int s) {
		xSpeed = s;
	}

	public void setYSpeed(int s) {
		ySpeed = s;
	}

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.white);
      setX(getX()+xSpeed);
		//setY
		setY(getY() + ySpeed);
		//draw the ball at its new location
	   draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if(super.equals(other) && getXSpeed() == other.getXSpeed() && getYSpeed() == other.getYSpeed()) return true;
		return false;
	}   

   //add the get methods

	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

   //add a toString() method
	public String toString() {
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
}