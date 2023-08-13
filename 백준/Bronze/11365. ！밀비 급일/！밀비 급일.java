import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String str = br.readLine();
            
            if(str.equals("END")){
                break;
            }
            
            StringBuilder r = new StringBuilder(str);
            sb.append(r.reverse()).append("\n");
        }
        System.out.println(sb);
    }
}