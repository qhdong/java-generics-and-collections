package generics.chap9.visitor.postageservice;

public class PostageVisitor implements Visitor {
    private double totalPostageForCart;

    @Override
    public void visit(Book book) {
        if (book.getPrice() < 10.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice() > 10) {
            totalPostageForCart += cd.getPrice() * 0.9;
        } else {
            totalPostageForCart += cd.getPrice();
        }
    }

    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
