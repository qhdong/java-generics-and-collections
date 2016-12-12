package generics.chap9.visitor.computer;

/**
 * Created by aaron on 16-12-12.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
