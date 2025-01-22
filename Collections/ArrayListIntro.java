package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListIntro {
    public static void main(String arg[]){
        // Collection<Integer> nums = new ArrayList<Integer>();

        // nums.add(9);
        // nums.add(2);
        // nums.add(3);
        // nums.add(5);

        // System.out.println(nums);

        // for(int num: nums){
        //     System.out.println(num);
        // }

        List<Integer> arr = new ArrayList<Integer>();

        arr.add(9);
        arr.add(19);
        arr.add(22);
        int value = arr.get(2);
        int index = arr.indexOf(19);
        System.out.println(index);
        System.out.println(value);
        System.out.println(arr);

        for(int num: arr){
            System.out.println(num);
        }
        Iterator<Integer> values = arr.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}
