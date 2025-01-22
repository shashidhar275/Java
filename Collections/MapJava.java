package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapJava {
    public static void main(String arg[]){
        // Map<String,Integer> nums = new HashMap<>();
        Map<String,Integer> nums = new Hashtable<>();

        nums.put("Shashidhar", 22);
        nums.put("Atharva",32);
        nums.put("Suresh",55);
        nums.put("Ganesh",19);

        System.out.println(nums);

        if(nums.get("Shashidhar")==null){
            System.out.println("No value");
        }else{
            System.out.println(nums.get("Shashidhar"));
        }

        System.out.println(nums.values());

        for(String s: nums.keySet()){
            System.out.println(s + " " + nums.get(s));
        }
    }
}
