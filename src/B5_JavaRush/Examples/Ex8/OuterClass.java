package B5_JavaRush.Examples.Ex8;

public class OuterClass {
    OuterClass(){ System.out.println("Create Outer class");
    }

    class InnerClass {
        static int ben = 2;
        InnerClass(){
            System.out.println("create inner class");
        }
        class InnerInnerClass{
            static int staticMember = 5;
            InnerInnerClass(){System.out.println("Create inner inner class");}
        }
    }
    static  class NestedClass {
        int alex = 2;
        static int yolo = 5;
        NestedClass(){
            System.out.println("create nested class");
        }
        static class NestedNestedClass{
            NestedNestedClass(){System.out.println("Create nested nested class");}

        }

    }
}
