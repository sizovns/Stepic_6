import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println(i);
        String s = pair.getSecond(); // "hello"
        System.out.println(s);

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println(mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustAlsoBeTrue);


        /*static Collection<?> collection = new Collection<Object>()
        Object object = new Object();
        //А дальше начинаем чекать:
        //collection.iterator(), и т. д.


        collection.add(object);
        collection.contains(object);
        collection.size();
        collection.iterator();
        collection.addAll(Arrays.asList(object));
        collection.clear();
        collection.toArray();
        collection.remove(object);*/


    }
}
