package generics.chap3;

/**
 * Created by aaron on 16-12-1.
 */
public class Fruit implements Comparable<Fruit> {
    protected String name;
    protected double size;

    @Override
    public int compareTo(Fruit o) {
        return (size < o.size) ? -1 :
                (size == o.size) ? 0 : 1;
    }
}
