package Unit_17;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Bullets {
    private ArrayList<Ammo> ammo;

    public Bullets() {
        ammo = new ArrayList<>(0);
    }

    public void add(Ammo am) {
        ammo.add(am);
    }

    //post - draw each Ammo
    public void drawEmAll(Graphics window) {
        if (ammo.size() > 0) {
            for (Ammo a : ammo) a.draw(window);
        }
    }

    public void moveEmAll() {
        if (ammo.size() > 0) {
            for (Ammo a : ammo) a.move("UP");
        }
    }

    public void cleanEmUp() {
        if (ammo.size() > 0) {
            for (int i = 0; i < ammo.size(); i++) {
                if (!ammo.get(i).isAlive()) {
                    ammo.remove(i);
                    i = 0;
                }
            }
        }
    }

    public Ammo getAmmo(int pos) {
        return ammo.get(pos);
    }

    public List<Ammo> getList() {
        return ammo;
    }

    public int getSize() {
        return ammo.size();
    }

    public void end() {
        if (ammo.size() > 0) {
            for (int i = 0; i < ammo.size(); i++) {
                ammo.get(i).setSpeed(0);
            }
        }
    }

    public String toString() {
        return "";
    }
}
