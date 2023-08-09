import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt(); // 과자 1개 가격
        int N = sc.nextInt(); // 과자 개수
        int M = sc.nextInt(); // 내가 가진 돈
        
        if(K * N - M < 0) System.out.println(0);
        else System.out.println(K * N - M);
    }
}