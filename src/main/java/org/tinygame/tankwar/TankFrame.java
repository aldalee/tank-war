package org.tinygame.tankwar;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 坦克大战游戏主窗口类
 */
public class TankFrame extends Frame {

    public TankFrame() {
        this.setTitle("Tank War");
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(800, 600);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(200, 200, 50, 50);
    }
}
