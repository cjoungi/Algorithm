import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String str = sc.nextLine();
            char[] c = new char[str.length()];
            
            if(str.equals("END")){
                break;
            }
            
            for(int i=0;i<c.length;i++){
                c[c.length - 1 - i] = str.charAt(i);
            }
            for(int i=0;i<c.length;i++){
                System.out.print(c[i]);
            }
            System.out.print("\n");
        }
    }
}