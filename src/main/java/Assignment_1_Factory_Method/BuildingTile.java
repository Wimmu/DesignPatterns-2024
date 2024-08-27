package Assignment_1_Factory_Method;

public class BuildingTile implements Tile {
    public char getCharacter() {
        return 'B';
    }

    public String getType() {
        return "Building";
    }

    @Override
    public int action() {
        return 0;
    }
}
