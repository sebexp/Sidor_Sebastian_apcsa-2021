package Unit_17;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import static java.lang.Character.toUpperCase;

public class OuterSpace extends Canvas implements KeyListener, Runnable {
    private final Ship ship;
    private final Ammo a;
    private final boolean game;
    private final AlienHorde horde;
    private final Bullets shots;
    private final Random ran;
    private final boolean[] keys;
    private boolean fired;
    private boolean lazer;
    private boolean alien;
    private boolean af1;
    private boolean af2;
    private int alienSpeed;
    private int round;
    private int lazerAmmo;
    private int r;
    private int g;
    private int b;
    private BufferedImage back;

    public OuterSpace() {
        setBackground(Color.white);
        keys = new boolean[5];
        ship = new Ship(350, 400, 100, 100, 3);
        round = 0;
        lazerAmmo = 42;
        alienSpeed = 1;
        alien = true;
        af1 = false;
        af2 = false;
        game = true;
        lazer = false;
        ran = new Random();
        a = new Ammo((ship.getX() + ship.getWidth() / 2) - 5, ship.getY() - 5, 5);
        horde = new AlienHorde(11);
        shots = new Bullets();
        this.addKeyListener(this);
        new Thread(this).start();
        setVisible(true);
    }

    public void update(Graphics window) {
        paint(window);
    }

    public void paint(Graphics window) {
        if (alien == true) {
            horde.generateHorde(115, 35, 40, 40, alienSpeed);
            alien = false;
        }
        Graphics2D twoDGraph = (Graphics2D) window;
        if (back == null) back = (BufferedImage) (createImage(getWidth(), getHeight()));

        Graphics graphToBack = back.createGraphics();
        graphToBack.setColor(Color.BLUE);
        graphToBack.drawString("StarFighter ", 25, 50);
        graphToBack.setColor(Color.BLACK);
        graphToBack.fillRect(0, 0, 800, 600);

        if (!horde.endGame(ship) || round == 0) {
            if (keys[0] == true) {
                if (ship.getX() > 0 - (ship.getWidth() / 2) + 2) ship.move("LEFT");
            }
            if (keys[1] == true) {
                if (ship.getX() < 800 - (ship.getWidth() / 2) - 18) ship.move("RIGHT");
            }
            if (keys[2] == true) {
                if (ship.getY() > 0 - 18) ship.move("UP");
            }
            if (keys[3] == true) {
                if (ship.getY() < 600 - ship.getHeight() / 2 - 50) ship.move("DOWN");
            }

            if (keys[4] == true && fired == true && lazer == false || (lazer == true && lazerAmmo > 0 && fired == false)) {
                shots.add(new Ammo((ship.getX() + ship.getWidth() / 2) - 5, ship.getY() - 5, 5));
                if (lazer == true) lazerAmmo--;
            }
            shots.drawEmAll(graphToBack);
            shots.moveEmAll();
            horde.drawEmAll(graphToBack);
            ship.draw(graphToBack);
            horde.moveEmAll();
            horde.removeDeadOnes(shots);
            shots.cleanEmUp();
            if (horde.getSize() == 0) {
                if (af1 && af2) {
                    r = ran.nextInt(1);
                    g = ran.nextInt(256);
                    // b = ran.nextInt(256-50)+50;
                    alien = false;
                    graphToBack.setColor(new Color(r, g, 255));
                    graphToBack.setFont(new Font(Font.SANS_SERIF, 250, 250));
                    graphToBack.drawString("WARP", 25, 300 - 40);
                    graphToBack.setFont(new Font(Font.SANS_SERIF, 220, 220));
                    graphToBack.drawString("SPEED", 25, 510 - 40);
                } else {
                    alien = true;
                    alienSpeed++;
                }
                round++;
                lazerAmmo = round * 5;
            }
        } else {
            graphToBack.setColor(Color.RED);
            graphToBack.setFont(new Font(Font.SANS_SERIF, 250, 250));
            graphToBack.drawString("GAME", 25, 300 - 40);
            graphToBack.drawString("OVER", 25, 510 - 40);
            shots.end();
            shots.drawEmAll(graphToBack);
            horde.drawEmAll(graphToBack);
            ship.draw(graphToBack);
        }
        graphToBack.setFont(new Font(Font.SANS_SERIF, 24, 24));
        graphToBack.setColor(Color.WHITE);
        if (round == 0) {
            graphToBack.drawString("Warm-Up", 335, 30);
            graphToBack.drawString("LAZER AMMO: " + lazerAmmo, 550, 30);
            if (lazer == true) {
                graphToBack.drawString("bullets = spacebar | lazer beam = v", 110, 530);
            } else {
                graphToBack.drawString("bullets = spacebar | lazer beam = v",
                        191, 530);
            }
            horde.setScore(0);
            if (horde.endGame(ship)) {
                graphToBack.setFont(new Font(Font.SANS_SERIF, 50, 50));
                graphToBack.drawString("DON'T TOUCH THE ALIENS", 60, 300);
            }
        } else {
            graphToBack.setFont(new Font(Font.SANS_SERIF, 24, 24));
            graphToBack.drawString("SCORE: " + horde.getScore(), 335, 30);
            graphToBack.drawString("LAZER AMMO: " + lazerAmmo, 550, 30);
        }
        graphToBack.setFont(new Font(Font.SANS_SERIF, 24, 24));
        graphToBack.drawString("ROUND " + round, 15, 30);
        twoDGraph.drawImage(back, null, 0, 0);
        if (lazer == false) {
            fired = false;
        }
        back = null;

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            keys[0] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            keys[1] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            keys[2] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            keys[3] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            fired = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            af1 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            af2 = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_V) {
            lazer = true;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            keys[0] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            keys[1] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            keys[2] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            keys[3] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
            af1 = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            af2 = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_V) {
            lazer = false;
        }
        repaint();
    }

    public void keyTyped(KeyEvent e) {
        switch (toUpperCase(e.getKeyChar())) {
            case ' ':
                keys[4] = true;
                break;
        }
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(5);
                repaint();
            }
        } catch (Exception e) {
        }
    }
}

