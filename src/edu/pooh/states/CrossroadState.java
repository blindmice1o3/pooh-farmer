package edu.pooh.states;

import edu.pooh.entities.Entity;
import edu.pooh.entities.creatures.Player;
import edu.pooh.main.Handler;
import edu.pooh.tiles.Tile;
import edu.pooh.time.TimeManager;
import edu.pooh.worlds.World;

import java.awt.*;

public class CrossroadState implements IState {

    public enum PlayerPreviousExit { GAME_STATE, MOUNTAIN_STATE, THE_WEST_STATE; }

    private Handler handler;
    private World world;

    private Object[] args;
    private Player player;
    private PlayerPreviousExit playerPreviousExit;

    public CrossroadState(Handler handler) {
        this.handler = handler;
        world = new World(handler, World.WorldType.CROSSROAD);

        playerPreviousExit = PlayerPreviousExit.GAME_STATE;
    } // **** end CrossroadState(Handler) constructor ****


    @Override
    public void enter(Object[] args) {
        TimeManager.setClockRunningTrue();

        handler.setWorld(world);
        player = (Player)args[0];

        this.args = args;

        /////////////////////////////////////////////////////////////////////////////////////
        if (playerPreviousExit == PlayerPreviousExit.GAME_STATE) {
            player.setPosition((world.getPlayerSpawnX() * Tile.TILE_WIDTH),
                    (world.getPlayerSpawnY() * Tile.TILE_HEIGHT));
        } else if (playerPreviousExit == PlayerPreviousExit.MOUNTAIN_STATE) {
            player.setPosition((7 * Tile.TILE_WIDTH),
                    (1 * Tile.TILE_HEIGHT));
        } else if (playerPreviousExit == PlayerPreviousExit.THE_WEST_STATE) {
            player.setPosition((Tile.TILE_WIDTH / 2),
                    (7 * Tile.TILE_HEIGHT));
        }
        /////////////////////////////////////////////////////////////////////////////////////
        world.getEntityManager().addEntity(player);
        world.getEntityManager().setPlayer(player);
    }

    @Override
    public void exit() {
        // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        TimeManager.incrementElapsedRealSecondsBy60();
        // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    }

    @Override
    public void tick() {
        if (StateManager.getCurrentState() != handler.getGame().getCrossroadState()) {
            return;
        }

        ///////////////
        world.tick();
        ///////////////

        checkTransferPoints();
    }

    private void checkTransferPoints() {
        if ( player.getCollisionBounds(0, 0).intersects(world.getTransferPointCrossroadToGame()) ) {
            ///////////////////////////////////////////////////
            playerPreviousExit = PlayerPreviousExit.GAME_STATE;

            if ((player.getHoldableObject() != null) && (player.getHoldableObject() instanceof Entity)) {
                Entity tempHoldableEntity = (Entity) player.getHoldableObject();

                if (world.getEntityManager().getEntities().remove(player.getHoldableObject())) {
                    ((GameState)handler.getGame().getGameState()).getWorld().getEntityManager().addEntity(
                            tempHoldableEntity
                    );
                }
            }
            ///////////////////////////////////////////////////
            StateManager.change(handler.getGame().getGameState(), args);
        } else if ( player.getCollisionBounds(0,0).intersects(world.getTransferPointCrossroadToMoutain()) ) {
            ///////////////////////////////////////////////////////
            playerPreviousExit = PlayerPreviousExit.MOUNTAIN_STATE;

            if ((player.getHoldableObject() != null) && (player.getHoldableObject() instanceof Entity)) {
                Entity tempHoldableEntity = (Entity) player.getHoldableObject();

                if (world.getEntityManager().getEntities().remove(player.getHoldableObject())) {
                    ((MountainState)handler.getGame().getMountainState()).getWorld().getEntityManager().addEntity(
                            tempHoldableEntity
                    );
                }
            }
            ///////////////////////////////////////////////////////
            StateManager.change(handler.getGame().getMountainState(), args);
        } else if ( player.getCollisionBounds(0,0).intersects(world.getTransferPointCrossroadToTheWest()) ) {
            ///////////////////////////////////////////////////////
            playerPreviousExit = PlayerPreviousExit.THE_WEST_STATE;

            if ((player.getHoldableObject() != null) && (player.getHoldableObject() instanceof Entity)) {
                Entity tempHoldableEntity = (Entity) player.getHoldableObject();

                if (world.getEntityManager().getEntities().remove(player.getHoldableObject())) {
                    ((TheWestState)handler.getGame().getTheWestState()).getWorld().getEntityManager().addEntity(
                            tempHoldableEntity
                    );
                }
            }
            ///////////////////////////////////////////////////////
            StateManager.change(handler.getGame().getTheWestState(), args);
        }
    }

    @Override
    public void render(Graphics g) {
        if (StateManager.getCurrentState() != handler.getGame().getCrossroadState()) {
            return;
        }

        ////////////////
        world.render(g);
        ////////////////
    }

    public World getWorld() {
        return world;
    }

} // **** end CrossroadState class ****