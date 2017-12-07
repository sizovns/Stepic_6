import java.util.function.Consumer;

public interface Sendable<T> {
    String getTo();
    String getFrom();
    T getContent();

}
