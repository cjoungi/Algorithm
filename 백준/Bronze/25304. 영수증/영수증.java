import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        
        for(int i=0;i<N;i++){ //구매한 물건 종류의 수만큼 반복
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }
        
        if(X==sum) System.out.println("Yes");
        else System.out.println("No");
        
    }
}