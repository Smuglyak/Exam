import java.util.HashMap;

class Exam {
    //printing the occurences of the words and by alphabetical order
    public static void main(String[] args) {
        HashMap<String, Integer> hashList = new HashMap<>();
        hashList.put("Do", 0);
        hashList.put("Do", 0);
        hashList.put("your", 0);
        hashList.put("best", 0);
        hashList.put("in", 0);
        hashList.put("your", 0);
        hashList.put("exam", 0);

        String[] hashList2 = {"Do", "Do", "your", "best", "in", "your", "exam"};
        for (String key : hashList2) {
            if(hashList.containsKey(key)){
                hashList.put(key, hashList.get(key) + 1);
            }
        }

        for (String key : hashList.keySet()) {
            if (hashList.get(key) != null) {
                System.out.println(key + " - " + hashList.get(key));
            }
        }

    }
}