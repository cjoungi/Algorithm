import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        for(int i = 0; i < s.length(); i += 10){
            int endIndex = i + 10;
            if (endIndex > s.length()) {
                endIndex = s.length();
            }
            System.out.println(s.substring(i, endIndex));
        }
    }
}