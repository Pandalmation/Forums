// no.14
import java.util.Scanner;
public class HourMinSec {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer value in seconds: ");
        int s = in.nextInt();
        int hour = 0 ;
        int min = 0 ;
        int sec = 0 ;

        if((s/3600) !=0){
            hour = s / 3600;
            s = s%3600;
        }
        if((s/60) !=0){
            min = s / 60;
            s = s%60;
        }
        if((s) != 0){
            sec = s;
        }
        System.out.print( s + " seconds are "+ hour +" hour, " + min + " minute, and "+ sec +" seconds.");
    }
}
