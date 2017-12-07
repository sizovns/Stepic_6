
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> T = new HashSet<>();
        HashSet<Integer> E = new HashSet<>();
        T.add(1);
        T.add(2);
        T.add(3);
        E.add(4);
        E.add(5);
        E.add(6);
        Set<Integer> set1 = createSet(1, 2, 3);
        Set<Integer> set2 = createSet(4, 5, 6);

        System.out.println(symmetricDifference(set1, set2));

    }
    private static final <T> Set<T> createSet(T... items) {
        Set<T> set = new HashSet<>();
        Collections.addAll(set, items);
        return set;
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet result = new HashSet<Integer>();
        for (T s1 : set1) {
            //System.out.println(s1);
            for (T s2 : set2) {
                if (!set1.contains(s2)) {
                    result.add(s2);
                }
                if (!set2.contains(s1)) {
                    result.add(s1);
                }
            }
        }

        /*for (T s1: set1){
            if (!set2.contains(s1)) {
                result.add(s1);
            }
        }
        for (T s2: set2){
            if (!set1.contains(s2)) {
                result.add(s2);
            }
        }*/

        return (Set<T>) result;
    }
}
