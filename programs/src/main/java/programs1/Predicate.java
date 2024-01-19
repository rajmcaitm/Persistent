package programs1;

@FunctionalInterface
public interface Predicate<T> {
 

    boolean test(T t);

}