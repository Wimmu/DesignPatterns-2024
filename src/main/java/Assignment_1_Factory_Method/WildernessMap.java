package Assignment_1_Factory_Method;

public class WildernessMap extends Map {
    private static final Tile[] WILDERNESS_TILES = {new SwampTile(), new WaterTile(), new ForestTile()};

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        return WILDERNESS_TILES[random.nextInt(WILDERNESS_TILES.length)];
    }
}
