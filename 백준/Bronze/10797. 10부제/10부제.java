import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int day = Integer.parseInt(br.readLine()); 
        String[] arr = br.readLine().split(" ");
        
        int count = 0;
        
        for(int i=0;i<5;i++){
            if(Integer.parseInt(arr[i]) == day){
                count++;
            }
        }
        System.out.println(count);
        
    }
}