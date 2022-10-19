package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.Class;

public class Class1 {
    public int hP;
    public int stamina;
    public int resilience;

    public Class1(int hPCap, int staminaCap, int resilienceCap) {
        hP = hPCap;
        stamina = staminaCap;
        resilience = resilienceCap;
    }

    Class1 warrior = new Class1(35_000, 1200, 1600);

}
