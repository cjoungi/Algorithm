import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
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
                System.out.print(c[i]);
            }
            System.out.println();
        }
    }
}