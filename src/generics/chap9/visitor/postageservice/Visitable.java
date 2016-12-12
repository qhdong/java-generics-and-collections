package generics.chap9.visitor.postageservice;

public interface Visitable {
    void accept(Visitor visitor);
}
