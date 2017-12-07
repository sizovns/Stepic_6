import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(pseudoRandomStream(13));
    }

    public static IntStream pseudoRandomStream(int seed) {
        int[] arr = IntStream.iterate(seed, n -> n * n / 10 % 1000).limit(10).toArray();
        for (int b : arr) {
            System.out.print(b+" ");
        }
        return IntStream.iterate(seed, n -> n * n / 10 % 1000); // your implementation here
    }
}
