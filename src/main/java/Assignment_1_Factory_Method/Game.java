package Assignment_1_Factory_Method;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();

        Map cityMap = game.createMap("city", 5, 5);
        System.out.println("City Assignment_1_Factory_Method.Map:");
        cityMap.display();

        Map wildernessMap = game.createMap("wilderness", 5, 5);
        System.out.println("\nWilderness Assignment_1_Factory_Method.Map:");
        wildernessMap.display();
    }

    public Map createMap(String type, int width, int height) {
        if ("city".equalsIgnoreCase(type)) {
            return new CityMap(width, height);
        } else if ("wilderness".equalsIgnoreCase(type)) {
            return new WildernessMap(width, height);
        } else {
            throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }
}
