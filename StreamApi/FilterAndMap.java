package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterAndMap {
    public static void main(String arg[]){
        List<Integer> nums = Arrays.asList(2,334,523,32,5,21);

        Predicate<Integer> p1 = new Predicate<Integer>(){

            @Override
            public boolean test(Integer n) {
                if(n%2==0){
                    return true;
                }else{
                    return false;
                }
                // TODO Auto-generated method stub
            }
            
        };

        // Predicate<Integer> p1 = n -> n%2==0;  //After applying Lambda expression

        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(p1);
        // s2.forEach(n->System.out.println(n));


        // Function<Integer,Integer> f = new Function<Integer,Integer>(){

        //     @Override
        //     public Integer apply(Integer n) {
        //         // TODO Auto-generated method stub
        //         return n*2;
        //     }
            
        // };

        Function<Integer,Integer> f =  n-> n*2;

        Stream<Integer> s3 = s2.map(f);
        // s3.forEach(n->System.out.println(n));

        Stream<Integer> s4 = s3.sorted();
        s4.forEach(n->System.out.println(n));
    }
}
