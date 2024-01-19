package programs2;

import java.util.function.Function;
 
@FunctionalInterface
public interface ToIntFunction<T> {
 
    int applyAsInt(T value);
}