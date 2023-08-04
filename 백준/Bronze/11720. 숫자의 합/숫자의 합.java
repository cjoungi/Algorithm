import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        br.readLine(); //변수에 저장할 필요가 없어서 입력만 받음
        
        int sum = 0;
        
        for(byte value : br.readLine().getBytes()){
            sum += (value - 48);
        }
        System.out.println(sum);
        br.close();
    }
}