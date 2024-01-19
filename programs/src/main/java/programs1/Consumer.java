package programs1;
@FunctionalInterface
public interface Consumer<T> {
 
    void accept(T t);
 
    // other default and static methods
}