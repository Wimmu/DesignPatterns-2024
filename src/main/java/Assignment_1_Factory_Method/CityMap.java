package Assignment_1_Factory_Method;

public class CityMap extends Map {
    private static final Tile[] CITY_TILES = {new RoadTile(), new ForestTile(), new BuildingTile()};

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        return CITY_TILES[random.nextInt(CITY_TILES.length)];
    }
}
