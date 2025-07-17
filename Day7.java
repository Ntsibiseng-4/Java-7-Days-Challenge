import java.util.Scanner;

public class Day7 {

    static String gradeMarks(int marks){
        if(marks >= 90){
            return "A";
        }else if(marks >= 80){
            return "B";
        }else if(marks >= 70){
            return "C";
        }else if(marks >= 60){
            return "D";
        }else if(marks >= 50){
            return "E";
        }else{
            return "F";
        }
    }
public static void main(String[] args) {
Scanner nal = new Scanner(System.in);

     System.out.print("How many students? ");
        int classNumber = nal.nextInt();
        nal.nextLine();

        // Create arrays to store names and marks
        String[] names = new String[classNumber];
        int[] marks = new int[classNumber];
        String[] grades = new String[classNumber];

        // Get input from user
        for (int i = 0; i < classNumber; i++) {
            System.out.print("Enter student name: ");
            names[i] = nal.nextLine();

            System.out.print("Enter marks for " + names[i] + ": ");
            marks[i] = nal.nextInt();
            nal.nextLine();

            grades[i] = gradeMarks(marks[i]); // Store grade2
    }

    System.out.println("====== Student Grades =====");
        for (int i = 0; i < classNumber; i++) {
            System.out.println("RESULTS: " +  names[i] + " >> Marks: " + marks[i] + ", Grade: " + grades[i]);
        }
}
}
