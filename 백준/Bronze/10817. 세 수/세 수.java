import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int max = 0;
        int max2 = 0;
        
        for(int i=0;i<3;i++){
            int val = Integer.parseInt(st.nextToken());
            
            if(max < val){
                max2 = max;
                max = val;
            }else if(max2 < val){
                max2 = val;
            }
        }
        System.out.println(max2);
    }
}