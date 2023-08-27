import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        String[] coord_1 = br.readLine().split(" ");
        String[] coord_2 = br.readLine().split(" ");
        String[] coord_3 = br.readLine().split(" ");
        
        String x, y;
        
        if(coord_1[0].equals(coord_2[0])){
            x = coord_3[0];
        }else if(coord_2[0].equals(coord_3[0])){
            x = coord_1[0];
        }else{
            x = coord_2[0];
        }
        if(coord_1[1].equals(coord_2[1])){
            y = coord_3[1];
        }else if(coord_2[1].equals(coord_3[1])){
            y = coord_1[1];
        }else{
            y = coord_2[1];
        }
        System.out.println(x + " " + y);
    }
}