package generics.chap9.visitor.Car;

/**
 * Created by aaron on 16-12-12.
 */
public interface CarElement {
    void accept(CarElementVisitor visitor);
}
