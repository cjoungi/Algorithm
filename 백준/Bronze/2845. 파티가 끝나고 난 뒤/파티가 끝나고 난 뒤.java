import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt(); // 1m²당 사람의 수
        int P = sc.nextInt(); // 파티 장소 넓이
        
        int[] arr = new int[5];
        String str = "";
        
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt() - L * P;
            str += arr[i] + " ";
        }
        System.out.println(str);
    }
}