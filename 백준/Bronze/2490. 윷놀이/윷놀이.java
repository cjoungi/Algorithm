import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        

        for(int i=0;i<3;i++){
            int N = 0;

            for(int j=0;j<4;j++){
               N += sc.nextInt();
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