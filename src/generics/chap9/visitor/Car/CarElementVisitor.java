package generics.chap9.visitor.Car;

/**
 * Created by aaron on 16-12-12.
 */
public interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
