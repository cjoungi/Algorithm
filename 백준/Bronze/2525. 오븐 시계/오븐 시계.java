import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken()); // 현재 시
        int m = Integer.parseInt(st.nextToken()); // 현재 분
        int t = Integer.parseInt(br.readLine()); // 요리 시간(분)

        int finH = (h+(m+t)/60)%24; //요리 끝나는 시각
        int finM = ((m+t)%60); //요리 끝나는 분
        
        System.out.println(finH+" "+finM);
     
    }
}