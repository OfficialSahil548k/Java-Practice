package Hashing;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap <String,Integer> uid = new HashMap<>();
        uid.put("Sahil", 614);
        uid.put("Saksham",618);
        uid.put("Rahul",592);
        uid.put("Saiyam", 616);

        // // size
        // System.out.println("size : "+ uid.size());

        // //get
        // System.out.println(uid.get("Sahil"));

        // //check Contained key
        // System.out.println(uid.containsKey("Rahul"));
        
        // // remmove
        // System.out.println(uid.remove("Rahul"));
        // System.out.println(uid.containsKey("Rahul"));

        // // empty 
        // uid.clear();
        // System.out.println(uid.isEmpty());

        Set<String> keys = uid.keySet();
        System.out.println(keys);

        for(String key : keys){
            System.out.print(uid.get(key)+" ");
        }
    }

}
