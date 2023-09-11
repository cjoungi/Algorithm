import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); 

        for(int i=1;i<=N;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=1;i<=N-1;i++){
            for(int j=0;j<N-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}