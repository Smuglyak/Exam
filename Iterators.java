import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(2);
        collection.add(2);
        collection.add(2);
        collection.add(2);
        collection.add(2);
        // Iterator<Integer> it = collection.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        // System.out.println();
        collection.forEach(e -> System.out.println(e));
    }
}
