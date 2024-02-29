import java.util.Comparator;

public class Student {
    private String name;
    private int grade;
    public static Comparator<Student> gradeComparator = Comparator.comparingInt(Student::getGrade);
}