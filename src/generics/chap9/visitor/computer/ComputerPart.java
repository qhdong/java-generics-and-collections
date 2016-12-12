package generics.chap9.visitor.computer;

/**
 * Created by aaron on 16-12-12.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
