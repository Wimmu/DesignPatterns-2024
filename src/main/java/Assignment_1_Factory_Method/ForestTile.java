package Assignment_1_Factory_Method;

public class ForestTile implements Tile {
    public char getCharacter() {
        return 'F';
    }

    public String getType() {
        return "Forest";
    }

    @Override
    public int action() {
        return 0;
    }
}
