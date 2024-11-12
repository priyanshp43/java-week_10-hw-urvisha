package week_10_Programmes;


import java.util.Scanner;

/**
 * java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * Use If else and While loop.
 */

public class StudentMarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName;
        int rollNo;
        int mathMarks, scienceMarks, englishMarks;


        // Input student details
        System.out.print("Enter Student Name: ");
        studentName  = scanner.nextLine();

        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();

        // Input marks with validation
        mathMarks = getValidMarks(scanner, "Math");
        scienceMarks = getValidMarks(scanner, "Science");
        englishMarks = getValidMarks(scanner, "English");

        //Calculate total, percentage and determine result and grade
        printMarkSheet(studentName, rollNo, mathMarks, scienceMarks, englishMarks);
        scanner.close();

    }

    private static int getValidMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.print("Enter " + subject + " Marks: ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid Input, Marks should be between 0 to 100");
            }
        }
        return marks;
    }

    private static void printMarkSheet(String studentName, int rollNo, int mathMarks, int scienceMarks, int englishMarks) {
        int totalMarks = mathMarks + scienceMarks + englishMarks;

        double percentage = (double) totalMarks / 3;
        String result;
        String grade;

        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
        }  else {
                result = "Fail";
                grade = "F";
            }

            // print Marksheet
        System.out.println("___________________________________");
        System.out.println("|                                  |");
        System.out.println("|        Mark Sheet                |");
        System.out.println("|__________________________________|");
        System.out.println("| Name          : " + studentName + "               |");
        System.out.println("| Roll No       : " + rollNo + "                |");
        System.out.println("|__________________________________|");
        System.out.println("| Subjects      : Marks            |");
        System.out.println("|__________________________________|");
        System.out.println("| Math          : " + mathMarks +   "               |");
        System.out.println("| Science       : " + scienceMarks +"               |");
        System.out.println("| English       : " + englishMarks +"               |");
        System.out.println("|__________________________________|");
        System.out.println("| Total         : " + totalMarks + "              |");
        System.out.println("|__________________________________|");
        System.out.println("| Percentage    : " + percentage + "             |");
        System.out.println("| Result        : " + result + "             |");
        System.out.println("| Grade         : " + grade + "                |");
        System.out.println("|__________________________________|");
        }

    }

