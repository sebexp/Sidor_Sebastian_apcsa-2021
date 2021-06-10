package Unit_17;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.*;

public class Ammo extends MovingThing {
    private int speed;
    private boolean alive = true;

    public Ammo() {
        this(0, 0, 5);
    }

    public Ammo(int x, int y) {
        this(x, y, 5);
    }

    public Ammo(int x, int y, int s) {
        super(x, y);
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public void draw(Graphics window) {
        window.setColor(Color.blue);
        window.fillRect(getX(), getY(), 10, 10);
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

    public boolean didCollide(Alien al) {
        if (getX() + 10 >= al.getX() && getX() <= al.getX() + al.getWidth() && getY() - 10 >= al.getY() && getY() <= al.getY() + al.getHeight()) {
            kill();
            return true;
        }
        return false;
    }

    public boolean isAlive() {
        if (getY() < 0) {
            kill();
        }
        return alive;
    }

    public void kill() {
        alive = false;
    }

    public String toString() {
        return "";
    }
}
