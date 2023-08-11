import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt(); // 방학 일 수
        int A = sc.nextInt(); // 국어 총 페이지
        int B = sc.nextInt(); // 수학 총 페이지
        int C = sc.nextInt(); // 하루에 풀 수 있는 국어 페이지
        int D = sc.nextInt(); // 하루에 풀 수 있는 수학 페이지
        int dayA = 0, dayB = 0;
        
        if(A % C != 0) dayA = A / C + 1;
        else dayA = A / C;
            
        if(B % D != 0) dayB = B / D + 1;
        else dayB = B / D;
            
        if(dayA >= dayB) System.out.println(L - dayA);
        else System.out.println(L - dayB);
    }
}