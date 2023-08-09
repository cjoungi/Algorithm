import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        String[] arr = br.readLine().split(" ");
        int K = Integer.parseInt(arr[0]); // 과자 1개 가격
        int N = Integer.parseInt(arr[1]); // 과자 개수
        int M = Integer.parseInt(arr[2]); // 내가 가진 돈
   
        if(K * N - M < 0) System.out.println(0);
        else System.out.println(K * N - M);
    }
}