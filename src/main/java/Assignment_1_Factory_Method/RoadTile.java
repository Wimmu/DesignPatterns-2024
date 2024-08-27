package Assignment_1_Factory_Method;

public class RoadTile implements Tile {
    public char getCharacter() {
        return 'R';
    }

    public String getType() {
        return "Road";
    }

    @Override
    public int action() {
        return 0;
    }
}
