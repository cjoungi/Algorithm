import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken()); // 한수의 x축 위치
        int y = Integer.parseInt(st.nextToken()); // 한수의 y축 위치
        int w = Integer.parseInt(st.nextToken()); // 직사각형의 가로 길이
        int h = Integer.parseInt(st.nextToken()); // 직사각형의 세로 길이

        int min = Math.min(Math.min(x, w - x),Math.min(y, h - y));
        
        System.out.println(min);
    }
}