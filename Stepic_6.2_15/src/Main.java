import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStream in = System.in;
        ArrayList<Integer> list = new ArrayList<Integer>();
        try(Scanner sc = new Scanner(in)) {
            while(sc.hasNext()) {
                sc.nextInt();
                if (sc.hasNext()){
                    list.add(sc.nextInt());
                }

            }
        }
        Collections.reverse(list);
        for (Integer i : list){
            System.out.print(i +" "); //Бред.
        }

    }

}
