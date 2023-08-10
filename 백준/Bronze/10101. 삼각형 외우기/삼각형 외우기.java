import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        if(a + b + c != 180){ // 세 각의 합이 180이 아닌 경우
            System.out.println("Error");
        }else if(a == 60 && b == 60 && c == 60){ // 세 각의 크기가 모두 60인 경우
            System.out.println("Equilateral");
        }else if(a == b || b == c || c == a){ // 세 각의 합이 180이고, 두 각이 같은 경우
            System.out.println("Isosceles");
        }else{ // 세 각의 합이 180이고, 같은 각이 없는 경우
            System.out.println("Scalene");
        }
    }
}