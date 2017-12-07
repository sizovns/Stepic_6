import java.util.*;
import java.util.function.*;

public class MailService<T> implements Consumer<Sendable<T>>{
    Map<String, List<T>> map = new HashMap<>();

    public Map<String, List<T>> getMailBox(){
        System.out.println(map);
        return map;
    }

    @Override
    public void accept(Sendable<T> tSendable) {
        String str = tSendable.getTo();
        List<T> list = new ArrayList<>();
        list.add(tSendable.getContent());
        /*if (map.containsKey(str)){
            list.add(map.);
            //list.add(tSendable.getContent());

        }*/
        //list.add(tSendable.getContent());
        if (map.containsKey(str)) {
            for (String s : map.keySet()) {
                map.put(s, list);
            }
        }
        map.put(str,list);
        //System.out.println(list);
        //map.put(str,list);
        //map.putAll(str,list);
    }
}



/*
abstract class Cache<K, V> extends HashMap<K, V> {
    @Override
    public V get(Object key) {
        if (containsKey(key)) {
            return super.get(key);
        } else {
            V val = getData(key);
            put((K)key, val);    // this is the line I'm discussing below
            return val;
        }
    }

    public abstract V getData(Object key);
}
 */
