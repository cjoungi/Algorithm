import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int num = 0;
        
        for(int i=1;i<=N;i++) {
        	if(N % i == 0) {
        		num++;
        		
        		if(num == K) {
        			System.out.println(i);
                    break;
        		}
        	}
        }
        if(num < K) {
        	System.out.println(0);
        }
    }
}