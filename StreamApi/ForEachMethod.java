package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String arg[]){
        List<Integer> nums = Arrays.asList(2,4,5,9,16);
        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        Consumer<Integer> con = n-> System.out.println(n);

        // System.out.println(nums);

        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }
        
        nums.forEach(con);
        // nums.forEach(n -> System.out.println(n));
    }
}
