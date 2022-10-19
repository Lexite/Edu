package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.AccessModifiers;

public class GettersExample {
    public static void main(String[] args) {
        PersonExample2 kate = new PersonExample2("Kate", 30);
        System.out.println(kate.getAge());
        kate.setAge(33);
        System.out.println(kate.getAge());
        kate.setAge(123450);
        System.out.println(kate.getAge());
    }
}
class PersonExample2 {
    private String name;
    private int age = 1;
    public PersonExample2(String name, int age) {
        setName(name);
        setAge(age);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        if (age > 0 && age < 110) {
            this.age = age;
        }
    }
}
