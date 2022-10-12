public class Main {
    public static void main(String[] args) {
        MagicBox<String> box = new MagicBox<>(4);
        box.boxCapacity();
        box.add("O");
        box.add("K");
        box.add("N");
        box.add("W");
        box.boxCapacity();
        box.pick();
    }
}
