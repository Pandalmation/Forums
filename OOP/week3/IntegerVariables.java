//no.11
import java.util.Scanner;
public class IntegerVariables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of X: ");
        int x = sc.nextInt();
        System.out.println("Enter the Value of Y: ");
        int y = sc.nextInt();
        System.out.println("Before swapping numbers: \nx value = " + x + "\ny value = " + y);
        int z = x;
        x = y;
        y = z;
        System.out.println("After swapping numbers: \nx value = " + x + "\ny value = " + y);
    }

}
