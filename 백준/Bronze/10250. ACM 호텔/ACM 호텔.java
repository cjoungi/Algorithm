import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); // 테스트 데이터 수
        
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int H = Integer.parseInt(st.nextToken()); // 호텔의 층 수
            int W = Integer.parseInt(st.nextToken()); // 각 층의 방 수
            int N = Integer.parseInt(st.nextToken()); // N번째 손님
            
            if(N % H == 0){
                System.out.println(H * 100 + N / H);
            }else{
                System.out.println(N % H * 100 + (N / H + 1));
            }
        }
    }
}