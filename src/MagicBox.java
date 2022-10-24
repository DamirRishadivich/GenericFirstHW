import java.util.Random;

public class MagicBox<T> {
    protected T[] box;
    protected Random random = new Random();

    public MagicBox(int maxItems) {
        this.box = (T[]) new Object[maxItems];
    }

    boolean add(T item) {
        for (int i = 0; i < box.length; i++) {
            if (box[i] == null) {
                box[i] = item;
                return true;
            }
        }
        return false;
    }

    T pick() {
        int lenght = 0;
        for (int i = 0; i < box.length; i++) {
            if (box[i] != null) {
                lenght++;
            }
        }
        for (int i = 0; i < box.length; i++) {
            if (lenght < box.length) {
                throw new RuntimeException("Магическая коробка не полная. В ней: " + lenght +
                        " из " + box.length + " элементов");
            }
        }
        int randomInt = random.nextInt(box.length + 1);
        T randomElement = box[randomInt];
        return randomElement;
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (int i = 0; i < box.length; i++) {
            if (i == box.length - 1) {
                string.append(box[i]);
            } else {
                string.append(box[i] + " ");
            }
        }
        string.append("]");
        return string.toString();
    }

}
