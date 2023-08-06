import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        
        int[] arr = new int[26]; // 알파벳의 개수를 저장하는 배열
        
        for(int i=0;i<S.length();i++){
            int a = S.charAt(i) - 97;
            arr[a]++;
        }
        
        for(int j=0;j<26;j++){
            sb.append(arr[j]).append(" ");
        }
        System.out.println(sb);
    }
}