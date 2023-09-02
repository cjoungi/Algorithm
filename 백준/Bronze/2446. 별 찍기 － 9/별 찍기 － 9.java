import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine()); 

        for(int i=N;i>0;i--){
            for(int j=0;j<N-i;j++){
                bw.write(" ");
            }
            for(int j=0;j<2*i-1;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        
        for(int i=1;i<N;i++){
            for(int j=0;j<N-1-i;j++){
                bw.write(" ");
            }
            for(int j=0;j<2*i+1;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}