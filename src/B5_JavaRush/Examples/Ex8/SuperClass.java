package B5_JavaRush.Examples.Ex8;

public class SuperClass {
    public static void main(String[] args) {
        //OuterClass.InnerClass outerInnerClass = new OuterClass().new InnerClass();
        OuterClass.NestedClass outerNestedClass = new OuterClass.NestedClass();
        System.out.println(outerNestedClass.alex);
        System.out.println(OuterClass.NestedClass.yolo);
        //OuterClass.InnerClass.InnerInnerClass outerInnerInnerClass = new OuterClass().new InnerClass().new InnerInnerClass();
        //OuterClass.NestedClass.NestedNestedClass outerNestedNestedClass = new OuterClass.NestedClass.NestedNestedClass();

        String lala = "lala";
        //System.out.println("create outer class");
        //System.out.println(lala.toUpperCase());




    }
}
