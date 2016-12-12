package generics.chap9.visitor.postageservice;

/**
 * Created by aaron on 16-12-12.
 */
public class Book implements Visitable {

    private double price;
    private double weight;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
