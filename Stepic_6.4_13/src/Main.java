import java.io.InputStream;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        /*InputStream in = System.in;
        ArrayList<String> list = new ArrayList<String>();
        try(Scanner s = new Scanner(in).useDelimiter(Pattern.compile("[\\p{Blank}\\p{Punct}]+"))) {
            while (s.hasNext()){
                list.add(s.next().toLowerCase());
            }

        }*/
        //System.out.println(list);
        /*
        Map<String, Long> result =
                list.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed().thenComparing(e -> e.getKey())).limit(10).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));


        List<String> al = new ArrayList<String>(finalMap.keySet());
        for (String str : al){
            System.out.println(str);
        }
        */

        Scanner s = new Scanner(System.in).useDelimiter("[\\p{Blank}\\p{Punct}]+");
        Map<String, Integer> finalMap = new HashMap<>();
        s.forEachRemaining(scan -> finalMap.merge(scan.toLowerCase(), 1, (i,n) ->  i + n));
        //Meтод merge принимает ключ, значение и функцию которая объединяет заданное значение и уже существующее в отображении, если таковое имеется.
        // Если в отображении под заданным ключем значения нет, то ложит туда указанное значение.
        System.out.println(finalMap);
        finalMap.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue)
                        .reversed().thenComparing(Map.Entry::getKey))
                .limit(10)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
