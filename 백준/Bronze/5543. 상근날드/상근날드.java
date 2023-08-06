import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int hamMin = 2001;
        int bevMin = 2001;
        
        for(int i=1;i<=5;i++){
            int price = sc.nextInt();
            
            if(i <= 3){ // 햄버거
                hamMin = Math.min(hamMin,price);
            }else{ //음료
                bevMin = Math.min(bevMin,price);
            }
        }
        System.out.println(hamMin + bevMin - 50);
    }
}