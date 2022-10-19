package B4_Metanit.P3_ObjectOrientedProgramming.Interfaces;
public class JournalNew implements Printer.Printable {
    String name;
    JournalNew(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}
