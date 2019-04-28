package edu.pooh.states;

import edu.pooh.entities.creatures.Player;
import edu.pooh.main.Handler;
import edu.pooh.tiles.Tile;
import edu.pooh.worlds.World;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CrossroadState implements IState {

    private Handler handler;
    private World world;

    private Object[] args;
    private Player player;

    public CrossroadState(Handler handler) {
        this.handler = handler;

        world = new World(handler, World.WorldType.CROSSROAD);
    } // **** end CrossroadState(Handler) constructor ****

    @Override
    public void enter(Object[] args) {
        handler.setWorld(world);
        player = (Player)args[0];

        this.args = args;

        /////////////////////////////////////////////////////////////////////////////////////
        player.setPosition(world.getPlayerSpawnX() * Tile.TILE_WIDTH,
                world.getPlayerSpawnY() * Tile.TILE_HEIGHT);
        /////////////////////////////////////////////////////////////////////////////////////

        world.getEntityManager().addEntity(player);
        world.getEntityManager().setPlayer(player);
    }

    @Override
    public void exit() {

    }

    @Override
    public void tick() {
        if (StateManager.getCurrentState() != handler.getGame().getCrossroadState()) {
            return;
        }

        if (handler.getKeyManager().keyJustPressed(KeyEvent.VK_ESCAPE)) {
            StateManager.change(handler.getGame().getGameState(), args);
        }

        ///////////////
        player.tick();
        ///////////////

        if ( player.getCollisionBounds(0, 0).intersects(world.getTransferPointCrossroadToGame()) ) {
            StateManager.change(handler.getGame().getGameState(), args);
            ///////////
        } else if ( player.getCollisionBounds(0,0).intersects(world.getTransferPointCrossroadToMoutain()) ) {
            StateManager.change(handler.getGame().getMountainState(), args);
        }
    }

    @Override
    public void render(Graphics g) {
        if (StateManager.getCurrentState() != handler.getGame().getCrossroadState()) {
            return;
        }

        // Render background image.
        world.render(g);
    }

} // **** end CrossroadState class ****