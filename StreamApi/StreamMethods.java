package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String arg[]){
        List<Integer> nums = Arrays.asList(2,3,7,13,8);
        Stream<Integer> s1 = nums.stream();
        // s1.forEach(n->System.out.println(n));

        Stream<Integer> s2 = s1.filter(n-> n%2==0);
        // s2.forEach(n-> System.out.println(n));
        Stream<Integer> s3 = s2.map(n -> n*2);
        // s3.forEach(n->System.out.println(n));
        Integer result = s3.reduce(0,(c,e)-> c+e);
        System.out.println(result);


        //Instead of all the above steps 
        Integer ans = nums.stream()
        .filter(n->n%2==0)
        .map(n->n*2)
        .reduce(0,(c,e)-> c+e);

        System.out.println(ans);
    }
}
