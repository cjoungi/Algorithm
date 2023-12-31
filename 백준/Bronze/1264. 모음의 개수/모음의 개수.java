import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String str = br.readLine().trim().toLowerCase(); // 소문자로 변환
            int count = 0;
            
            if(str.equals("#")){
                break;
            }
                
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}