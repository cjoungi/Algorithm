import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException {
 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		for(int a=1;a<=M;a++) {
            st = new StringTokenizer(br.readLine());
            
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			for(int b=i-1;b<j;b++) {
				arr[b] = k;
			}
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
		br.close();
	}
 
}