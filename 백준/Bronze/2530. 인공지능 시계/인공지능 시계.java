import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(br.readLine());
        
        // 1분은 60초이기 때문에 D초를 60으로 나눠서 나온 몫과 나머지를 각 분, 초에 합산
        B += D / 60;
        C += D % 60;
        
        // C초를 60초 이히로 정리해주기 위해 60으로 나눠서 몫과 나머지를 분과 초에 합산 및 대입
        B += C / 60;
        C = C % 60;
        
        // B분을 60분 이하로 정리해주기 위해 60으로 나눠서 몫과 나머지를 분과 초에 합산 및 대입
        A += B / 60;
        B = B % 60;
        
        // A시를 24시 이하로 정리해주기 위해 24로 나눠서 나머지만 대입
        A = A % 24;
        
        System.out.println(A + " " + B + " " + C);
    }
}