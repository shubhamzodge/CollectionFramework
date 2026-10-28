package CollectionFramework;
import java.util.*;
//nice Q. L-137;
//Given an integer array nums where every element appears three times
// except for one,
// which appears exactly once.
// Find the single element and return it.

public class Elements {
    public static void main(String[] args){
        Map<Integer,Integer>map = new HashMap<>();
        int [] arr = {1,2,3,2,1,1};

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //find element with count =1;
        //{1=3, 2=2, 3=1} -> [(1,3), (2,2), (3,1)]
        //map.entrySet:converts it into key value pair
       // Map.Entry is a single key–value pair inside a Map
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
