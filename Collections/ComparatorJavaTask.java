package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorJavaTask {
    public static void main(String arg[]){
        List<String> str = new ArrayList<String>();
        Comparator<String> c = new Comparator<String>(){
            public int compare(String s1,String s2){
                if(s1.length()>s2.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        str.add("Shashidhar");
        str.add("Nandeesh");
        str.add("Attu");
        str.add("Suresh");

        System.out.println(str);
        // Collections.sort(str);
        // System.out.println(str);

        Collections.sort(str,c);

        System.out.println(str);
    }
}
