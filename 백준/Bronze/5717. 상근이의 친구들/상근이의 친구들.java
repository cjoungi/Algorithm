import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int M = Integer.parseInt(st.nextToken()); // 남자 친구의 수
            int F = Integer.parseInt(st.nextToken()); // 여자 친구의 수
            
            if(M==0 && F==0){
                break;
            }
            
            System.out.println(M + F);
        }
    }
}