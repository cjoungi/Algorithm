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
            String str = br.readLine();
            char[] c = new char[str.length()];
            
            if(str.equals("END")){
                break;
            }
            
            for(int i=0;i<c.length;i++){
                c[c.length - 1 - i] = str.charAt(i);
            }
            for(int i=0;i<c.length;i++){
                bw.write(c[i]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}