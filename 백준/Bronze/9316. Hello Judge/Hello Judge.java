import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<=N;i++){
            sb.append("Hello World, Judge ").append(i).append("!");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}