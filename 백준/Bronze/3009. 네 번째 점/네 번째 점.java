import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] coord_x = new int[3];
        int[] coord_y = new int[3];
        
        for(int i = 0; i < 3; i++){
            coord_x[i] = sc.nextInt();
            coord_y[i] = sc.nextInt();
        }

        int x = 0, y = 0;
        
        if(coord_x[0] == coord_x[1]){
            x = coord_x[2];
        }else if(coord_x[0] == coord_x[2]){
            x = coord_x[1];
        }else{
            x = coord_x[0];
        }
        if(coord_y[0] == coord_y[1]){
            y = coord_y[2];
        }else if(coord_y[0] == coord_y[2]){
            y = coord_y[1];
        }else{
            y = coord_y[0];
        }
        System.out.println(x + " " + y);
    }
}