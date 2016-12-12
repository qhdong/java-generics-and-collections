package generics.chap9.visitor.museum;

/**
 * Created by aaron on 16-12-12.
 */
public class TestVisitor {
    public static void main(String[] args) {
        FirstTimeVisitor visitor = new FirstTimeVisitor();
        City city = new City();
        city.accept(visitor);
    }
}
