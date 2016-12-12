package generics.chap4;

/**
 * Created by aaron on 16-12-7.
 */
public class Pair<T, U> {
    private final T first;
    private final U second;
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() { return first; }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Origin", 20);
        System.out.println(pair.getFirst() + pair.getSecond());
    }
}
