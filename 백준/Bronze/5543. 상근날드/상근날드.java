import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        int hamMin = 2001;
        int bevMin = 2001;
        
        for(int i=1;i<=5;i++){
            int price = Integer.parseInt(br.readLine());
            
            if(i <= 3){ // 햄버거
                if(price < hamMin){
                    hamMin = price;
                }
            }else{ //음료
                if(price < bevMin){
                    bevMin = price;
                }
            }
        }
        System.out.println(hamMin + bevMin - 50);
    }
}