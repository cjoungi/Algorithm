import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        String str = "";
        
        if(A>0 && B>0) str="1";
        if(A<0 && B>0) str="2";
        if(A<0 && B<0) str="3";
        if(A>0 && B<0) str="4";
        
        System.out.println(str);
    }
}