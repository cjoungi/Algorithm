import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); // 한수의 x축 위치
        int y = sc.nextInt(); // 한수의 y축 위치
        int w = sc.nextInt(); // 직사각형의 가로 길이
        int h = sc.nextInt(); // 직사각형의 세로 길이
            
        int arr[] = {x, w - x, y, h - y};
        Arrays.sort(arr); // 오름차순 정렬
        
        System.out.println(arr[0]);
    }
}