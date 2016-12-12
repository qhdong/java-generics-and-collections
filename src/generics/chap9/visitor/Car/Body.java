package generics.chap9.visitor.Car;

/**
 * Created by aaron on 16-12-12.
 */
public class Body implements CarElement {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}