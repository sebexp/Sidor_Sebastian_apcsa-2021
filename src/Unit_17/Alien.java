package Unit_17;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.imageio.ImageIO;
import java.awt.*;
import java.net.URL;

public class Alien extends MovingThing {
    private int speed;
    private Image image;

    public Alien() {
        this(0, 0, 30, 30, 0);
    }

    public Alien(int x, int y) {
        this(x, y, 30, 30, 0);
    }

    public Alien(int x, int y, int s) {
        this(x, y, 30, 30, s);
    }

    public Alien(int x, int y, int w, int h, int s) {
        super(x, y, w, h);
        speed = s;
        try {
            URL url = getClass().getResource("/images/alien.jpg");
            image = ImageIO.read(url);
        } catch (Exception e) {
            System.out.println("Hey, watch where you're walking here! You're gonna step on my foot, you animal.");
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
    }

    public void draw(Graphics window) {
        window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
    }

    public String toString() {
        return super.toString() + " " + getSpeed();
    }
}
