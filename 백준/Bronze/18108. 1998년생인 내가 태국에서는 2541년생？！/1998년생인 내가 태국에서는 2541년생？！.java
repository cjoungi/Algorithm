import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int dif = 2541-1998;
        
        int A = Integer.parseInt(br.readLine());
        
        System.out.println(A - dif);
    }
}