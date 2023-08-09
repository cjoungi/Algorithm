import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int K = Integer.parseInt(st.nextToken()); // 과자 1개 가격
        int N = Integer.parseInt(st.nextToken()); // 과자 개수
        int M = Integer.parseInt(st.nextToken()); 
        
        if(K * N - M < 0) System.out.println(0);
        else System.out.println(K * N - M);
    }
}