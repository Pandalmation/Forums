import java.util.Scanner;

public class MachineProb2 {
    public static void main (String[] args) {
        printArrayInStars();
    }
    
    public static void printArrayInStars() {
        Scanner sc = new Scanner(System.in);    // to ask for user's input

        System.out.println("Enter the number of items: ");
        int NUM_ITEMS = sc.nextInt();           // user enters how many items they wish to input in an array and store it in an int var called NUM_ITEMS
        int items[] = new int [NUM_ITEMS];      // array containing user's input of how many items 

        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < NUM_ITEMS; i++){    // storing values in an int array called items
            items[i] = sc.nextInt();
        }
        sc.close();

        for (int i=0; i < NUM_ITEMS; i++) {     // nested loop to print out the result of user's array input
            System.out.print(i + ": ");
            for(int x=0; x < items[i]; x++){
                System.out.print("*");
            }
            System.out.println("("+ items[i] + ")");
        }

    }
}