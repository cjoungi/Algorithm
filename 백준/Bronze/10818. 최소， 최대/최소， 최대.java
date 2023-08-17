import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int min = 1000001;
        int max = -1000001;
        
        while(st.hasMoreTokens()){
            int val = Integer.parseInt(st.nextToken());
            
            if(min > val) min = val;
            if(max < val) max = val;
        }
        System.out.println(min + " " + max);
    }
}