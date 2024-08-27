package Assignment_1_Factory_Method;

public class WaterTile implements Tile {
    public char getCharacter() {
        return 'W';
    }

    public String getType() {
        return "Water";
    }

    @Override
    public int action() {
        return 0;
    }
}
