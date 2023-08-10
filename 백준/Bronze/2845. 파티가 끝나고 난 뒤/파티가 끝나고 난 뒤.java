import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int L = Integer.parseInt(st.nextToken()); // 1m²당 사람의 수
        int P = Integer.parseInt(st.nextToken()); // 파티 장소 넓이
        
        st = new StringTokenizer(br.readLine());
        br.close();
        
        int[] arr = new int[5];
        
        for(int i=0;i<5;i++){
            arr[i] = Integer.parseInt(st.nextToken()) - L * P; // 참가자 수 차이
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}