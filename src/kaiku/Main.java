package kaiku;

public class Main {
    public static World world;

    public static void main(String[] args) {
        world = new World();
        world.gameThread.start();
    }
}
