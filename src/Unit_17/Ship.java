package Unit_17;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.imageio.ImageIO;
import java.awt.*;
import java.net.URL;

public class Ship extends MovingThing {
    private int speed;
    private Image image;

    public Ship() {
        this(10, 10, 10, 10, 10);
    }

    public Ship(int x, int y) {
        this(x, y, 100, 100, 10);
    }

    public Ship(int x, int y, int s) {
        this(x, y, 100, 100, s);
    }

    public Ship(int x, int y, int w, int h, int s) {
        super(x, y, w, h);
        speed = s;
        try {
            URL url = getClass().getResource("/images/ship.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            System.out.println("Yeah, something went wrong. Good luck finding what it is, bro!");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public void move(String direction) {
        if (direction.equals("RIGHT")) {
            setX(getX() + speed);
        }
        if (direction.equals("LEFT")) {
            setX(getX() - speed);
        }
        if (direction.equals("DOWN")) {
            setY(getY() + speed);
        }
        if (direction.equals("UP")) {
            setY(getY() - speed);
        }
    }

    public void draw(Graphics window) {
        window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }

    public boolean didCollide(Alien al) {
        if (getX() + getWidth() - 30 >= al.getX() && getX() <= al.getX() + al.getWidth() - 30 && getY() + getHeight() - 30 >= al.getY() && getY() <= al.getY() + al.getHeight() - 30)
            return true;
        return false;
    }

    public String toString() {
        return super.toString() + " " + getSpeed();
    }
}
