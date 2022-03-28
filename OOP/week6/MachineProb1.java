import java.util.Scanner;

public class MachineProb1 {
    public static void main (String[] args) {
        PrintArray();
    }

    public static void PrintArray() {
        Scanner sc = new Scanner(System.in);    // to ask for user input

        System.out.println("Enter the number of items: ");
        int NUM_ITEMS = sc.nextInt();           // user enters how many items they wish to input in an array and stores it in an int variable called NUM_ITEMS
        int items[] = new int [NUM_ITEMS];      // array containing the users input of how many items

        System.out.println("Enter the value of all items (separated by space): ");
        for (int i = 0; i < NUM_ITEMS; i++) {   // storing values in an int array called items
            items[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("The values are: [");  // printing out the result of user's array input
        for (int i= 0; i < NUM_ITEMS; i++) { 
            if (i == NUM_ITEMS - 1){
                System.out.print(items[i] + "]");
            }
            else {
                System.out.print(items[i]+ ", ");
            }
        }
    }
}