import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main (String[] args) {
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> listT = stream.sorted(order).collect(Collectors.toList());


        if (listT.isEmpty()){
            minMaxConsumer.accept(null,null);
        }
        else {
            T minT = listT.get(0);
            T maxT = listT.get(listT.size()-1);
            minMaxConsumer.accept(minT,maxT);
        }
    }

}
