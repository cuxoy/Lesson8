package lesson8;

public class Main {
    public static void main(String[] args) {
        Primitives primitives = new Primitives();
        WithFinals withFinals = new WithFinals(15, "sec", true);
        House house = new House();
        House.wall(3, 2, "stone");
        House.window(1.1, 2.2, true);
        House.tv(100, false, "berezka");


    }
}
