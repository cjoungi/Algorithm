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
       
        System.out.println(m<45?h-1<0?23+" "+(60+(m-45)):h-1+" "+(60+(m-45)):h+" "+(m-45));
    }
}