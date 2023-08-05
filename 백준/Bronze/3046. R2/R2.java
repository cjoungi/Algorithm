import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        String[] arr = br.readLine().split(" ");
        int R1 = Integer.parseInt(arr[0]);
        int S = Integer.parseInt(arr[1]);
        int R2 = S*2 - R1;

        System.out.println(R2);
    }
}