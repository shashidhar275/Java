import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputJava {
    public static void main(String arg[]) throws NumberFormatException, IOException{
        // int num = 2;
        // System.out.println("Enter a number");
        // try{
        //     num = System.in.read();
        // }catch(IOException e){
        //     System.out.println("IOException");
        // }
        // System.out.println(num);
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close(); 

    }
}
