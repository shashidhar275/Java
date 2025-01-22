import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
    public static void main(String arg[]) throws NumberFormatException, IOException{
        BufferedReader bf = null ;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }finally{
            bf.close();
        }
    }
}
