package B5_JavaRush.Examples.Ex1226;

public class Program {
    public static void main(String[] args) {
        Student student = new Student("Amigo");
        System.out.println(student.name);
        student.printAgain();
    }
}

class Student {
    Integer alex1;
    public String name;
    static int alex = 5;
    Student(String name) {
        this.name = name;
    }
    static void print() {
        System.out.println(alex);
    }
    void printAgain() {
        print();
    }
}

class HaveMe {
    static class HaveMeMore {
        void HaveMeMoreMore(){}
    }
}


class OuterClass{
    OuterClass(){}
    class InnerClass{
        void InnerClassMethod(){}
        static void StaticInnerClassMethod(){}
    }
    static class StaticInnerClass{
        void StaticInnerClassMethod(){}
        static void StaticStaticInnerClassMethod(){}
    }

}

