import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" "); 

        int h = Integer.parseInt(arr[0]); // 현재 시
        int m = Integer.parseInt(arr[1]); // 현재 분
        int t = Integer.parseInt(br.readLine()); // 요리 시간(분)

        int finH = (h+(m+t)/60)%24; //요리 끝나는 시각
        int finM = ((m+t)%60); //요리 끝나는 분
        
        System.out.println(finH+" "+finM);
     
    }
}