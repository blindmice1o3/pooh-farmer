package edu.pooh.states;

import edu.pooh.entities.creatures.Player;
import edu.pooh.gfx.Assets;
import edu.pooh.main.Game;
import edu.pooh.main.Handler;
import edu.pooh.tiles.Tile;
import edu.pooh.worlds.World;

import java.awt.*;
import java.awt.event.KeyEvent;

public class HomeState implements IState {

    private Handler handler;
    private World world;

    private Object[] args;
    private Player player;


    private Rectangle mapTransferPointDoorOut;

    public HomeState(Handler handler) {
        this.handler = handler;
        args = new Object[5];

        world = new World(handler, World.WorldType.HOME);
    } // **** end HomeState(Handler) constructor ****


    int prevBoundsX = 0;
    int prevBoundsY = 0;
    int prevBoundsWidth = 0;
    int prevBoundsHeight = 0;
    @Override
    public void enter(Object[] args) {
        handler.setWorld(world);

        if ((args[0] != null) && (args[0] instanceof Player)) {
            player = (Player)args[0];
            prevBoundsX = player.getBoundsX();
            prevBoundsY = player.getBoundsY();
            prevBoundsWidth = player.getBoundsWidth();
            prevBoundsHeight = player.getBoundsHeight();

            player.setBoundsX(14);
            player.setBoundsY(16);
            player.setBoundsWidth(32);
            player.setBoundsHeight(44);
            player.setWidth(60);
            player.setHeight(52);

            /////////////////////////////////////////////////////////////////////////////////////
            player.setPosition(world.getPlayerSpawnX() * 59, world.getPlayerSpawnY() * 60);
            /////////////////////////////////////////////////////////////////////////////////////

            world.getEntityManager().addEntity(player);
            world.getEntityManager().setPlayer(player);
        }
    }

    @Override
    public void exit() {
        args[0] = player;
        args[1] = prevBoundsX;
        args[2] = prevBoundsY;
        args[3] = prevBoundsWidth;
        args[4] = prevBoundsHeight;
    }

    @Override
    public void tick() {
        if (StateManager.getCurrentState() != handler.getGame().getHomeState()) {
            return;
        }

        if (handler.getKeyManager().keyJustPressed(KeyEvent.VK_ESCAPE)) {
            StateManager.change(handler.getGame().getGameState(), args);
        }

        ///////////////
        player.tick();
        ///////////////

        if ( player.getCollisionBounds(0, 0).intersects(world.getTransferPointHomeToGame()) ) {
            StateManager.change(handler.getGame().getGameState(), args);
            ///////////
        }
        //checkMapTransferPoints();
    }

    public void checkMapTransferPoints() {
        /*
        Rectangle tempTransferPointBounds = new Rectangle(7* Tile.TILE_WIDTH, 17*Tile.TILE_HEIGHT, Tile.TILE_WIDTH, Tile.TILE_HEIGHT);
        if (tempTransferPointBounds.intersects(entityManager.getPlayer().getCollisionBounds(0, 0))) {
            StateManager.setCurrentState(handler.getGame().homeState);
        }
        */
    }

    @Override
    public void render(Graphics g) {
        if (StateManager.getCurrentState() != handler.getGame().getHomeState()) {
            return;
        }

        // Render background image.
        //g.drawImage(Assets.homeStateBackground, 0, 0, Game.WIDTH_OF_FRAME, Game.HEIGHT_OF_FRAME, null);
        world.render(g);

        // Render player image.
        //player.render(g);
    }

} // **** end HomeState class ****