package programs2;

import java.util.Objects;
 
@FunctionalInterface
public interface BiConsumer<T, U> {
 
    void accept(T t, U u);
 
    // other default and static methods
}