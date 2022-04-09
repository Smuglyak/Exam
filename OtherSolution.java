import java.util.HashMap;
import java.util.TreeMap;

public class OtherSolution {
    //printing the occurences of the words and by alphabetical order
    public static void main(String[] args) {
        String words[] = { "Do", "Do", "your", "and", "best", "in", "your", "exam" };
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : words)
            map.put(w, map.getOrDefault(w, 0) + 1);
        // Answer 1:
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);
        for (String s : map.keySet()) {
            System.out.println(s + " = " + map.get(s) + " ");
            treeMap.put(s, map.get(s));
        }

        System.out.println();
        // Answer 2;

        for (String s : treeMap.keySet()) {
            System.out.println(s + " = " + map.get(s) + " ");
        }
    }
}
