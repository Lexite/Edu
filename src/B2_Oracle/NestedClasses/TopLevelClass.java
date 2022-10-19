package Learning.FirstLearnign.NestedClasses;


public class TopLevelClass {
    static void accessMembers(OuterClass outer) {
        System.out.println(outer.outerField);
        System.out.println(OuterClass.staticOuterField);
    }
}
