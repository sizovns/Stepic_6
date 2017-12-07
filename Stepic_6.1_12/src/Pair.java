public class Pair<T,S> {
    private final T tvalue ;
    private final S svalue ;


    public Pair(T tvalue, S svalue) {
        this.tvalue = tvalue;
        this.svalue = svalue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (tvalue != null ? !tvalue.equals(pair.tvalue) : pair.tvalue != null) return false;
        return svalue != null ? svalue.equals(pair.svalue) : pair.svalue == null;
    }

    @Override
    public int hashCode() {
        int result = tvalue != null ? tvalue.hashCode() : 0;
        result = 31 * result + (svalue != null ? svalue.hashCode() : 0);
        return result;
    }

    public T getFirst(){
        return tvalue;
    }

    public S getSecond(){
        return svalue;
    }

    public static  <T,S>  Pair<T,S> of (T tvalue, S svalue){
        return new Pair<>(tvalue, svalue);
    }
}
