package Assignment_1_Factory_Method;

public class SwampTile implements Tile {
    public char getCharacter() {
        return 'S';
    }

    public String getType() {
        return "Swamp";
    }

    @Override
    public int action() {
        return 0;
    }
}
