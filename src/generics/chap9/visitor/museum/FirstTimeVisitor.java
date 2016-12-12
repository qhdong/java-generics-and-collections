package generics.chap9.visitor.museum;

public class FirstTimeVisitor implements Visitor {
    @Override
    public void visit(City city) {
        System.out.println("I'm visiting the city!");
    }

    @Override
    public void visit(Museum museum) {
        System.out.println("I'm visiting the museum!");
    }

    @Override
    public void visit(Park park) {
        System.out.println("I'm visiting the park!");
    }
}
