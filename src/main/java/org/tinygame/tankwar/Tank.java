package org.tinygame.tankwar;

import java.awt.*;

public class Tank {
    private static final int SPEED = 10;

    private int x, y;
    private Dir dir;


    public Tank(int x, int y, Dir dir) {
        super();
        this.x = x;
        this.y = y;
        this.dir = dir;
    }


    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public Dir getDir() {
        return dir;
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);

        switch (dir) {
            case LEFT -> x -= SPEED;
            case UP -> y -= SPEED;
            case RIGHT -> x += SPEED;
            case DOWN -> y += SPEED;
            default -> {
            }
        }
    }
}
