
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradesPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradesPoints = new ArrayList<>();
    }

    public double averageOfGrades() {
        double sum = 0;
        if (!grades.isEmpty()) {
            for (double grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.size();
        }
        return (double) -1;

    }

    public double averageOfPoints() {
        double sum = 0;
        if (!grades.isEmpty()) {
            for (double point : gradesPoints) {
                sum += point;
            }
            return (double) sum /gradesPoints.size();
        }
        return (double) -1;

    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.gradesPoints.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
