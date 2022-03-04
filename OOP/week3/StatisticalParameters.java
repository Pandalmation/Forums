//no.10
import java.util.Scanner;

public class StatisticalParameters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("input x1: ");
        int x1 = input.nextInt();
        System.out.print("input x2: ");
        int x2 = input.nextInt();
        System.out.print("input x3: ");
        int x3 = input.nextInt();

        int Mean = (x1 + x2 + x3)/3;
        var Variance = (Math.pow((x1-Mean),2)+Math.pow((x2-Mean),2)+Math.pow((x3-Mean),2))/3;;
        double StandardDev = Math.sqrt(Variance);

        System.out.println("Mean: " + Mean + "\nVariance: " + Variance + "\nStandard Deviation: " + StandardDev);

    }
}
