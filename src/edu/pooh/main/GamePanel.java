package edu.pooh.main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    Game game;

    public GamePanel(Game game) {
        this.game = game;

        setDoubleBuffered(true);
        setFocusable(false);
    } // **** end edu.pooh.main.GamePanel() constructor ****

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.YELLOW);
        g.fillRect(30, 30, getWidth()-60, getHeight()-60);

        g.drawString("Width: " + getWidth() + " | Height: " + getHeight(), 5, 17);
    }

} // **** end edu.pooh.main.GamePanel class ****