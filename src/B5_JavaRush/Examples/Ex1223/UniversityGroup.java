package B5_JavaRush.Examples.Ex1223;
import java.util.*;

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Ben Rosenbaum");
        students.add("Ben Mayert");
        students.add("Ben Lock");
        students.add("Ben Albert");
        students.add("Ben Rosen");


    }

    public void exclude(String excludedStudent) {
        ArrayList<String> copy = new ArrayList<>(students);
        for (String student : copy) {
            if (student.equals(excludedStudent)) {
                students.remove(student);
            }
        }
    }
    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Ben Lock");
        universityGroup.students.forEach(System.out::println);
    }
}
