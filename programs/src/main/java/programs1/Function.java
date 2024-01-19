package programs1;

@FunctionalInterface
public interface Function<T, R> {
 
    R apply(T t);
 
    // other default and static methods
}