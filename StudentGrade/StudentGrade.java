import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number of students: ");
        int numStudent = input.nextInt();

        System.out.println("Enter number of subjects: ");
        int numSubject = input.nextInt();

        System.out.println("Saving>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");

        int[][] scores = new int[numStudent][numSubject];

        for (int student = 0; student < numStudent; student++) {
            for (int subject = 0; subject < numSubject; subject++) {

                int score;

                do {
                    System.out.println("Entering score for student " + (student + 1));
                    System.out.println("Entering score for subject " + (subject + 1));
                    score = input.nextInt();
                }
                while (score > 100 || score < 0);

                scores[student][subject] = score;
            }
        }

        int[] totals = new int[numStudent];
        double[] averages = new double[numStudent];

        for (int student = 0; student < numStudent; student++) {

            int total = 0;

            for (int subject = 0; subject < numSubject; subject++) {
                total += scores[student][subject];
            }

            totals[student] = total;
            averages[student] = (double) total / numSubject;
        }

        int[] positions = new int[numStudent];

        for (int currentStudent = 0; currentStudent < numStudent; currentStudent++) {

            int position = 1;

            for (int nextStudent = 0; nextStudent < numStudent; nextStudent++) {

                if (averages[nextStudent] > averages[currentStudent]) {
                    position++;
                }
            }

            positions[currentStudent] = position;
        }

        System.out.println("==========================================================");

        System.out.print("STUDENT\t");

        for (int subject = 0; subject < numSubject; subject++) {
            System.out.print("SUB" + (subject + 1) + "\t");
        }

        System.out.println("TOT\tAVE\tPOS");
        System.out.println("==========================================================");

        for (int student = 0; student < numStudent; student++) {

            System.out.print("Student " + (student + 1) + "\t");

            for (int subject = 0; subject < numSubject; subject++) {
                System.out.print(scores[student][subject] + "\t");
            }

            System.out.printf(
                "%d\t%.2f\t%d%n",
                totals[student],
                averages[student],
                positions[student]
            );
        }

        System.out.println("\n\nSUBJECT SUMMARY");

        for (int subject = 0; subject < numSubject; subject++) {

            int highestScore = scores[0][subject];
            int lowestScore = scores[0][subject];

            int highestStudent = 0;
            int lowestStudent = 0;

            int subjectTotal = 0;
            int passes = 0;
            int fails = 0;

            for (int student = 0; student < numStudent; student++) {

                int score = scores[student][subject];

                subjectTotal += score;

                if (score > highestScore) {
                    highestScore = score;
                    highestStudent = student;
                }

                if (score < lowestScore) {
                    lowestScore = score;
                    lowestStudent = student;
                }

                if (score >= 50) {
                    passes++;
                }
                else {
                    fails++;
                }
            }

            double subjectAverage = (double) subjectTotal / numStudent;

            System.out.println("\nSubject " + (subject + 1));
            System.out.println(
                "Highest scoring student is: Student "
                + (highestStudent + 1)
                + " scoring "
                + highestScore
            );

            System.out.println(
                "Lowest scoring student is: Student "
                + (lowestStudent + 1)
                + " scoring "
                + lowestScore
            );

            System.out.println("Total score is: " + subjectTotal);

            System.out.printf(
                "Average score is: %.2f%n",
                subjectAverage
            );

            System.out.println("Number of passes: " + passes);
            System.out.println("Number of fails: " + fails);
        }

        System.out.println("\n==============================");
        System.out.println("CLASS SUMMARY");
        System.out.println("==============================");

        int bestStudent = 0;
        int worstStudent = 0;

        int classTotal = 0;

        for (int student = 0; student < numStudent; student++) {

            classTotal += totals[student];

            if (totals[student] > totals[bestStudent]) {
                bestStudent = student;
            }

            if (totals[student] < totals[worstStudent]) {
                worstStudent = student;
            }
        }

        double classAverage = (double) classTotal / numStudent;

        System.out.println(
            "Best Graduating Student is: Student "
            + (bestStudent + 1)
            + " scoring "
            + totals[bestStudent]
        );

        System.out.println(
            "Worst Graduating Student is: Student "
            + (worstStudent + 1)
            + " scoring "
            + totals[worstStudent]
        );

        System.out.println("Class total score is: " + classTotal);

        System.out.printf(
            "Class average score is: %.2f%n",
            classAverage
        );
    }
}