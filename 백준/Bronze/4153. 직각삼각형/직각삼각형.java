import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            if(a==0 && b==0 && c==0) break;
            
            if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
                bw.write("right");
            }else if(Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2)){
                bw.write("right");
            }else if(Math.pow(c,2)+Math.pow(a,2)==Math.pow(b,2)){
                bw.write("right");
            }else{
                bw.write("wrong");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}