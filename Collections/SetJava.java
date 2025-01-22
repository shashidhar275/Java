package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetJava {
    public static void main(String arg[]){
        // Set<Integer> nums = new HashSet<Integer>();
        // nums.add(32);
        // nums.add(22);
        // nums.add(78);
        // nums.add(65);
        // nums.add(7);
        // nums.add(22);
        // for(int value: nums){
        //     System.out.println(value);
        // }
        
        Set<Integer> arr = new TreeSet<Integer>();

        arr.add(32);
        arr.add(22);
        arr.add(78);
        arr.add(65);
        arr.add(7);
        arr.add(22);

        Iterator<Integer> elements = arr.iterator();
        while(elements.hasNext()){
            System.out.println(elements.next());
        }
    }
}
