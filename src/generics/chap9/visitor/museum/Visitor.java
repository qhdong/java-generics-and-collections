package generics.chap9.visitor.museum;

/**
 * Created by aaron on 16-12-12.
 */
public interface Visitor {
    void visit(City city);
    void visit(Museum museum);
    void visit(Park park);
}
