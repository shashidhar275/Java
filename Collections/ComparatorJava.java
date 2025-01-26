package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorJava {
    public static void main(String arg[]){
        Comparator<Integer> c = new Comparator<Integer>(){
            public int compare(Integer value1,Integer value2){
                if(value1%10 > value2%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(98);
        nums.add(29);
        nums.add(65);
        nums.add(12);
        nums.add(9);
        Collections.sort(nums);
        System.out.println(nums);

        //To sort based on last digit of number

        Collections.sort(nums, c);
        System.out.println(nums);
    }
}
