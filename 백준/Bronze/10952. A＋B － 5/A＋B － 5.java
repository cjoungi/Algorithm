import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException {
 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st;
        
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if(a==0 && b==0){
                br.close();
                break;
            }
			System.out.println(a+b);
		}
	}
 
}