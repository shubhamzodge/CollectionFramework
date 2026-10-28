package CollectionFramework;
import java.util.*;

public class Hashmap2 {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();

        //insert elemnts in map
        map.put("apple", map.getOrDefault("apple", 0) + 1);
        map.put("kela", map.getOrDefault("kela", 0) + 1);
        map.put("nimbu", map.getOrDefault("nimbu", 0) + 1);

        if (map.containsKey("apple")) {
            System.out.println("apple exists, count = "+map.get("apple"));
        }
    }
}
