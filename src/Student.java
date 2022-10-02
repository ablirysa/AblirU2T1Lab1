public class Student {

    private int grade;
    private double GPA;
    private String name;

    public Student(String studentName, int currentGrade, double avg) {
        name = studentName;
        grade = currentGrade;
        GPA = avg;
    }

    public void gradeComparison() {
        if (GPA >= 85) {
            System.out.println("Hello my name is " + name + ", I am in " + grade + "th Grade, and I am part of honor roll");
        }
        else {
            System.out.println("Hello my name is " + name + " and I am in " + grade + "th Grade.");
        }
    }
}
