import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        String[] coord_1 = {st.nextToken(),st.nextToken()};
        st = new StringTokenizer(br.readLine()," ");
        String[] coord_2 = {st.nextToken(),st.nextToken()};
        st = new StringTokenizer(br.readLine()," ");
        String[] coord_3 = {st.nextToken(),st.nextToken()};
        
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