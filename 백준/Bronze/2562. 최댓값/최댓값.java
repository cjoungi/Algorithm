import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = Integer.parseInt(br.readLine());
        int num = 1;
        
        for(int i=1;i<9;i++){
            int N = Integer.parseInt(br.readLine());
            int a = i+1;
            
            if(max < N){
                max = N;
                num = a;
            } 
        }
        System.out.println(max + "\n" + num);
    }
}