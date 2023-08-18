import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        int[] arr2 = new int[9];
        
        for(int i=0;i<9;i++){
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }
        Arrays.sort(arr);
        
        for(int i=0;i<9;i++){
            if(arr[8] == arr2[i]){
                System.out.println(arr[8] + "\n" + (i+1));
            }
        }
        
        
    }
}