package generics.chap9.visitor.computer;

/**
 * Created by aaron on 16-12-12.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
    void visit(Keyboard keyboard);
}
