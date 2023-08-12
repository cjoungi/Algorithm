import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arrS = br.readLine().split(" ");
        String[] arrT = br.readLine().split(" ");
        
        int S = 0,T = 0;
        
        for(int i=0;i<4;i++){
            S += Integer.parseInt(arrS[i]);
            T += Integer.parseInt(arrT[i]);
        }
        System.out.println(Math.max(S,T));
    }
}