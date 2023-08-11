import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        int L = Integer.parseInt(br.readLine()); // 방학 일 수
        int A = Integer.parseInt(br.readLine()); // 국어 총 페이지
        int B = Integer.parseInt(br.readLine()); // 수학 총 페이지
        int C = Integer.parseInt(br.readLine()); // 하루에 풀 수 있는 국어 페이지
        int D = Integer.parseInt(br.readLine()); // 하루에 풀 수 있는 수학 페이지
        
        double max = Math.max((double)A / (double)C , (double)B / (double)D);
        max = Math.ceil(max);
        
        System.out.println(L - (int)max);
    }
}