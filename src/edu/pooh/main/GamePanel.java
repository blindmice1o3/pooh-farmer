package edu.pooh.main;

import edu.pooh.gfx.ImageLoader;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    Game game;

    public GamePanel(Game game) {
        this.game = game;
    } // **** end edu.pooh.main.GamePanel() constructor ****

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.YELLOW);
        g.fillRect(30, 30, getWidth()-60, getHeight()-60);

        g.drawImage(ImageLoader.loadImage("/textures/world/harvest moon tile sprite sheet.png"),
                100, 50, null);
    }

} // **** end edu.pooh.main.GamePanel class ****