import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        int num = 0;
        
        for(int i=1;i<=N;i++) {
        	if(N % i == 0) {
        		num++;
        		
        		if(num == K) {
        			System.out.println(i);
        		}
        	}
        }
        if(num < K) {
        	System.out.println(0);
        }
    }
}