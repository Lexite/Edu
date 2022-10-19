package Learning.FirstLearnign.NestedClasses;

public class Students {
    int age = 17;
    static int subjects = 12;

    class EleventhGrade {
        void studentsData() {
            System.out.println(age);
            System.out.println(subjects);
        }
    }

    static class MathClass {
        void studentsData(Students students) {
            System.out.println(students.age);
            System.out.println(subjects);
        }
    }

    public static void main(String[] args) {
        System.out.println("EleventhGrade");
        System.out.println("----------");
        Students students = new Students();
        EleventhGrade eleventhGrade = students.new EleventhGrade();
        eleventhGrade.studentsData();

        System.out.println("MathClass");
        System.out.println("----------");
        MathClass mathClass = new MathClass();
        mathClass.studentsData(students);

        System.out.println("School");
        System.out.println("----------");
        School school = new School();
        school.studentsData(students);
        
    }

}
