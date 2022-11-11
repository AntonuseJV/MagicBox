public class Main {
    public static void main(String[] args) {

        MagicBox<String> box1 = new MagicBox<>(3);
        MagicBox<Integer> box2 = new MagicBox<>(3);

        box1.add("table");
        box1.add("chair");
        box1.add("wardrobe");
        box1.add("book");
        box1.pick();

        box2.add(15);
        box2.add(45);
        box2.pick();
    }
}
