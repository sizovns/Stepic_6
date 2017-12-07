public class Salary implements Sendable<Integer>{


    private String to,from;
    private Integer content;

    public Salary(String to, String from, Integer content) {

        this.to = to;
        this.from = from;
        this.content = content;
    }
    @Override
    public String getTo() {
        return to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public Integer getContent() {
        return content;
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
