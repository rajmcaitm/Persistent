package programs1;

@FunctionalInterface
public interface BiPredicate<T, U> {
 
    boolean test(T t, U u);
 
    // other default and static methods
}