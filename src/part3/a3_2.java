package part3;

import java.util.ArrayList;
import java.util.List;

public class a3_2 {


    public interface Predicate<T> {
        boolean test(T t);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {

        List<T> results = new ArrayList<>();
        for(T t : list) {
            if(p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }



    public static void main(String[] args) {

        Predicate<Integer> p = (Integer a) -> a.equals(10);
        filter(new ArrayList<>(), p );


    }
}
