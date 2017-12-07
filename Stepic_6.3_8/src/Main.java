
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        /*
    Для тестирования кода:
*/
        Predicate<Object> condition = Objects::isNull; // ссылка на метод isNull.
        Function<Object, Integer> ifTrue = obj -> 0; //функция всегда возвращает 0, независимо от аргумента
        Function<CharSequence, Integer> ifFalse = CharSequence::length; //возвращает длину CharSequence
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        //(некое_условие) ? (если true, то делаем это) : (если false, то делаем это).
        //T -> (condition(t)) ? (ifTrue.apply(t)) : (ifFalse.apply(t))

        return (T t) -> (condition.test(t)) ? (ifTrue.apply(t)) : (ifFalse.apply(t)); // your implementation here

    }
}
