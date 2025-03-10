import java.util.*;

public class GradeCalculator {
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) 
            return "A+";
        else if (percentage >= 80) 
            return "A";
        else if (percentage >= 70) 
            return "B";
        else if (percentage >= 60) 
            return "C";
        else if (percentage >= 50) 
            return "D";
        else 
            return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        float[] marks = new float[numSubjects];
        float totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextFloat();
            if(marks[i]<0 || marks[i]>100){
                System.out.println("Invalid Mark! Enter a valid mark");
                i--;
                continue;                
            }
            else{
                totalMarks += marks[i];
            }
            
        }

        float averagePercentage = totalMarks / numSubjects;
        String grade = calculateGrade(averagePercentage);

        System.out.println("\n----- Results -----");
        System.out.println("Total Marks: " + totalMarks + " / " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
