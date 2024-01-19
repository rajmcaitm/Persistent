package programs1;

@FunctionalInterface
public interface BiFunction<T, U, R> {
 
    R apply(T t, U u);
     
    // other default and static methods
}