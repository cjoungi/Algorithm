import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = 0;

            for(int j=0;j<4;j++){
               N += Integer.parseInt(st.nextToken());
            }

            if(N==3){
                System.out.println("A");
            }else if(N==2){
                System.out.println("B");
            }else if(N==1){
                System.out.println("C");
            }else if(N==0){
                System.out.println("D");
            }else{
                System.out.println("E");
            }
        }
    }
}