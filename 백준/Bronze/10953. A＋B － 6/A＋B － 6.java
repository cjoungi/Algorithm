import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) {
 
		Scanner sc = new Scanner(System.in);
        
		int T = sc.nextInt();
 
		for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(sc.next(),",");
			
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
 
			System.out.println(a + b);
		}
		sc.close();
	}
}