import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    protected int size;
    protected T[] items;

    public MagicBox(int size) {
        this.size = size;
        items = (T[]) new Object[size];
    }

    int filled = 0;

    //TODO метод add - добавление предмета
    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                filled += 1;
                System.out.println(Arrays.toString(items));
                return true;
            }
        }
        System.out.println("для нового элемента в коробке нет места.");
        return false;
    }

    int randomInt;

    //TODO метод pick - выбор (случайного предмета)
    public T pick() {
        Random random = new Random();
        if (filled < items.length) {
            throw new RuntimeException("свободных ячеек: " + (items.length - filled) + ", их надо заполнить.");
        }
        if (filled == items.length) {
            randomInt = random.nextInt(items.length);
            System.out.println("коробка заполнена.");
            System.out.println("случайный элемент из коробки: " + items[randomInt]);
            System.out.println();
            return items[randomInt];
        }
        return null;
    }
}
