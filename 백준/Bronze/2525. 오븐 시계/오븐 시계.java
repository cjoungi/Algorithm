import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cook = sc.nextInt();
        
        int finishedHour = (hour*60+min+cook)/60; //요리 끝나는 시각
        int finishedMin = (hour*60+min+cook)%60; //요리 끝나는 분
        
        if(finishedHour>=24) { //24시가 지남
            System.out.println(finishedHour-24+" "+finishedMin);
        }
        else System.out.println(finishedHour+" "+finishedMin);
        
    }
}