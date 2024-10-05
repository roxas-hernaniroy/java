import java.util.Scanner;
public class InterbaseCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int totalStudents = 0;
        String presentState = "N";
        int totalPresent = 0;
        int totalAbsent = 0;

        System.out.println("Total number of students: ");
        totalStudents = userInput.nextInt();
        userInput.nextLine();

        for (int studentIndex = 0; studentIndex < totalStudents; studentIndex++) {
            System.out.println("Is student " + (studentIndex + 1) + " present? [Y/N]: ");
            presentState = userInput.nextLine();

            switch (presentState.toUpperCase()) {
                case "Y":
                    totalPresent++;
                    break;
                case "N":
                    totalAbsent++;
                    break;
                default:
                    System.out.println("Invalid value.");
                    studentIndex--;
                    break;
            }
        }
        System.out.println("Total present: " + totalPresent);
        System.out.println("Total absent: " + totalAbsent);
    }
}
