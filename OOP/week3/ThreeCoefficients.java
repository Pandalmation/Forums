//no.13
import java.util.Scanner;
public class ThreeCoefficients {
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the coefficient a: ");
        int a = input.nextInt();
        System.out.printf("Enter the coefficient b: ");
        int b = input.nextInt();
        System.out.printf("Enter the constant c: ");
        int c = input.nextInt();

        double d = Math.pow(b,2)-(4*a*c);
        if(d == 0){
            double x = (-b) + (Math.sqrt(Math.pow(b,2))-(4*a*c))/(2*(a));
            System.out.println("This equation has one solution: " + x);
        }
        else if(d < 0){
            System.out.println("This equation has no real solution");
        }
        else if(a == 0){
            System.out.println("The value of a cannot be 0");
        }
        else{
            double x1 = ((-b) + Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*(a));
            double x2 = ((-b) - Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*(a));
            System.out.println("x1 value: " + x1);
            System.out.println("x2 value: " + x2);
        }
    }
}