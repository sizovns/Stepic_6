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
        System.out.println(safeStringLength);

    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

       /* Function<T, U> myFunct = new Function<T, U>() {
            @Override
            public U apply(T t) {
                return  condition.test(t) ?  ifTrue.apply(t): ifFalse.apply(t);
            }
        };
        return myFunct;*/


        return new Function<T, U>() {
            @Override
            public U apply(T t) {
                return  condition.test(t) ?  ifTrue.apply(t): ifFalse.apply(t);
            }
        };

        // t - Экземпляр Function, т.к. Function функ. интерфейс мы можем его инстанцировать блаодоря лямбда выражению
        //return t -> (condition.test(t)) ? (ifTrue.apply(t)) : (ifFalse.apply(t)); // your implementation here

    }
}
