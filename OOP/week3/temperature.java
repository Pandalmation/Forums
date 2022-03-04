//no.9
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in Celcius: ");
        double Celcius = input.nextDouble();

        double Farenheit = ((Celcius * 9/5) + 32);
        System.out.println(Celcius + " Celcius degrees are " + Farenheit + "Farenheit degrees ");

    }
}
