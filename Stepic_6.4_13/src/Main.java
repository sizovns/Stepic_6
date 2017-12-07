import java.io.InputStream;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        InputStream in = System.in;
        ArrayList<String> list = new ArrayList<String>();
        try(Scanner s = new Scanner(in).useDelimiter(Pattern.compile("[\\p{Blank}\\p{Punct}]+"))) {
            while (s.hasNext()){
                list.add(s.next().toLowerCase());
            }

        }
        //System.out.println(list);

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

        //System.out.println(prefinalMap);
        List<String> al = new ArrayList<String>(finalMap.keySet());
        for (String str : al){
            System.out.println(str);
        }
        //System.out.println(al);

    }
}
