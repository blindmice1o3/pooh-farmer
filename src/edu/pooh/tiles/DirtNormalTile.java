package edu.pooh.tiles;

import edu.pooh.entities.statics.StaticEntity;
import edu.pooh.gfx.Assets;

import java.awt.*;

public class DirtNormalTile extends Tile {

    private int x, y;
    private boolean seedable;
    private StaticEntity staticEntity;

    public DirtNormalTile(int x, int y) {
        super(Assets.dirtNormal, 0);
        this.x = x;
        this.y = y;
        seedable = false;
        staticEntity = null;
    } // **** end DirtNormalTile(int, int) constructor ****

    @Override
    public boolean isSolid() {
        return false;
    }

    @Override
    public void render(Graphics g, int x, int y) {
        if (staticEntity == null) {
            g.drawImage(texture, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT, null);
        } else {
            staticEntity.render(g);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getSeedable() {
        return seedable;
    }

    public void setSeedable(boolean seedable) {
        this.seedable = seedable;
    }

    public StaticEntity getStaticEntity() {
        return staticEntity;
    }

    public void setStaticEntity(StaticEntity staticEntity) {
        this.staticEntity = staticEntity;
    }

} // **** end DirtNormalTile class ****