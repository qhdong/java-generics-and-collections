package generics.chap3;

/**
 * Created by aaron on 16-12-1.
 */
public class Apple extends Fruit {
    public Apple(double size) {
        name = "Apple";
        this.size = size;
    }

    @Override
    public String toString() {
        return "Apple{size=" + size + "}";
    }
}
