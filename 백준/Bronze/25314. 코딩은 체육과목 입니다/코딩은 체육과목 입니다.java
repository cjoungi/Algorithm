import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int num = Integer.parseInt(br.readLine())/4;
        
        String str = "";
        
        for(int i=0;i<num;i++){
            str += "long ";
            
            if(i==num-1){
                str += "int";
            }
        }
        System.out.println(str);
    }
}