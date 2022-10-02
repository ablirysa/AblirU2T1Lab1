public class StudentRunner {
    public static void main(String[] args) {
        Student person1 = new Student("Thomas", 10, 93);
        Student person2 = new Student("Randall", 12, 76);

        person1.gradeComparison();
        person2.gradeComparison();
    }
}
