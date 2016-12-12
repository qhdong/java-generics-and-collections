package generics.chap9.visitor.computer;

/**
 * Created by aaron on 16-12-12.
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
