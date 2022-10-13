import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MagicBox<String> box = new MagicBox<>(4);
        System.out.println(box.toString());
        box.add("O");
        box.add("K");
        box.add("N");
        box.add("W");
        System.out.println(box.toString());
        System.out.println(box.pick());
        System.out.println(box.toString());


    }
}
