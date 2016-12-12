package generics.chap4;

/**
 * Created by aaron on 16-12-7.
 */
public class Cell<T> {
    private final int id;
    private final T value;
    private static int count = 0;
    private static synchronized int nextId() {
        return count++;
    }
    public Cell(T value) {
        this.value = value;
        id = nextId();
    }

    public T getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    public static synchronized int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Cell<String> a = new Cell<>("ONE");
        Cell<Integer> b = new Cell<>(2);
        System.out.printf("%s, %d, %d", a.getId(), b.getId(), Cell.getCount());
    }
}
