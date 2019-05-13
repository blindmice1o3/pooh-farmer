package edu.pooh.entities.creatures.live_stocks;

import edu.pooh.entities.creatures.Creature;
import edu.pooh.gfx.Animation;
import edu.pooh.gfx.Assets;
import edu.pooh.main.Handler;
import edu.pooh.tiles.Tile;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Chicken extends Creature {

    public enum ChickenState { CHICK, ADULT_EGG_LAYING, ADULT_GRUMPY_1, ADULT_GRUMPY_2, ADULT_GRUMPY_3; }

    private Animation animUp;
    private Animation animDown;
    private Animation animLeft;
    private Animation animRight;

    private Random random;
    private int daysInstantiated;
    private ChickenState chickenState;

    public void incrementChickenStateByDaysInstantiated() {
        switch (daysInstantiated) {
            case 0:
            case 1:
            case 2:
                chickenState = ChickenState.CHICK;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                chickenState = ChickenState.ADULT_EGG_LAYING;
                break;
            default:
                System.out.println("Chicken.incrementChickenStateByDaysInstanted() switch-construct's default statement.");
                break;
        }
    }

    public Chicken(Handler handler, float x, float y, ChickenState chickenState) {
        super(handler, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT);

        animUp = new Animation(400, Assets.chickenUp);
        animDown = new Animation(400, Assets.chickenDown);
        animLeft = new Animation(400, Assets.chickenLeft);
        animRight = new Animation(400, Assets.chickenRight);

        setSpeed(4);

        random = new Random();
        daysInstantiated = 0;
        this.chickenState = chickenState;
    } // **** end Chicken(Handler, float, float) constructor ****

    @Override
    public void tick() {
        animUp.tick();
        animDown.tick();
        animLeft.tick();
        animRight.tick();

        randomlyMove();
        move();
    }

    private void randomlyMove() {
        if (random.nextInt(100) == 1) {
            int moveDir = random.nextInt(5);

            switch (moveDir) {
                case 0:
                    xMove = -1;
                    break;
                case 1:
                    xMove = 1;
                    break;
                case 2:
                    yMove = -1;
                    break;
                case 3:
                    yMove = 1;
                    break;
                default:
                    xMove = 0;
                    yMove = 0;
                    break;
            }
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
                (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
    }

    private BufferedImage getCurrentAnimationFrame() {
        // ANIMATION MOVEMENTS
        if (xMove < 0) {                                // Moving left.
            return animLeft.getCurrentFrame();
        } else if (xMove > 0) {                         // Moving right.
            return animRight.getCurrentFrame();
        } else if (yMove < 0) {                         // Moving up.
            return animUp.getCurrentFrame();
        } else if (yMove > 0) {                         // Moving down.
            return animDown.getCurrentFrame();
        } else {
            return Assets.chickenDown[0];
        }
    }

    @Override
    public void hurt(int amt) { return; }

    @Override
    public void die() {
        setActive(false);
    }

    public void setChickenState(ChickenState chickenState) { this.chickenState = chickenState; }
    public ChickenState getChickenState() { return chickenState; }

    public int getDaysInstantiated() { return daysInstantiated; }
    public void increaseDaysInstantiated() {
        daysInstantiated++;
    }

} // **** end Chicken class ****