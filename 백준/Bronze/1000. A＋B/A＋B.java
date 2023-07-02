import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int형 변수 A와 B에 숫자 입력받기
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        System.out.println(A+B);
        
        sc.close();
    }
}