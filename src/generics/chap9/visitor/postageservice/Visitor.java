package generics.chap9.visitor.postageservice;

/**
 * Created by aaron on 16-12-12.
 */
public interface Visitor {
    void visit(Book book);
    void visit(CD cd);
}
