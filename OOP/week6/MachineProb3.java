import java.util.Scanner;
import java.text.DecimalFormat;

public class MachineProb3{
    public static void main (String[] args) {
        StudGrades();
    }
    public static void StudGrades() {
        DecimalFormat DEF = new DecimalFormat();    
        DEF.setMaximumFractionDigits(2);        //rounded to two decimal places
        
        Scanner sc = new Scanner(System.in);    // takes in user input
        System.out.printf("Enter the number of students: ");    
        int numStudents = sc.nextInt();         // prompts user for number of students and saves it in an int var
        
        int Grades[] = new int[numStudents];    // creating int array called Grades that stores x number of students grades
        double sum = 0;
        int min = 100, max = 0;

        for (int i = 0; i < numStudents; i++){
            System.out.printf("Enter the grade for student %d: ", i+1);   // prompts the user for the grade of each student
            Grades[i] = sc.nextInt();   // saves user's input in an int array called Grades
            sum += Grades[i];
            if (Grades[i] > max) {
                max = Grades[i];
            }
            if (Grades[i] < min) {
                min = Grades[i];
            }
        }
        sc.close();
        
        double avg = (sum/numStudents); // formula for average
        
        System.out.println("The average is: " + DEF.format(avg));  
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}