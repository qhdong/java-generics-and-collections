package generics.chap9.visitor.Car;

/**
 * Created by aaron on 16-12-12.
 */
public class VisitDemo {
    public static void main(String[] args) {
        CarElement car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}
