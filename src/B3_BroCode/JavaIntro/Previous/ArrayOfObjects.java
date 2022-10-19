package B3_BroCode.JavaIntro.Previous;
public class ArrayOfObjects {
    public static void main(String[] args) {
    Food food1 = new Food("pizza");
    Food food2 = new Food("icecream");
    Food food3 = new Food("Meat");
    Food[] food = {food1,food2,food3};
    System.out.println(food[0].getName());
    System.out.println(food[1].getName());
    System.out.println(food[2].getName());
    MyFriend alexei = new MyFriend("Alexei","Rusnac",25,false);
    MyFriend vasilii = new MyFriend("Vasilii","Novikov",26,false);
    MyFriend natasha = new MyFriend("Natasha","Dubceac",26,true);
    MyFriend.printData(alexei);
    MyFriend.printData(alexei);
    MyFriend.printData(alexei);

    System.out.println();
    alexei.setName("Alex");
    alexei.setFamilyName("Rusnac");
    alexei.setAge(30);
    alexei.setMarried(true);
    vasilii.setName("Vasilii");
    vasilii.setFamilyName("Novikov");
    vasilii.setAge(31);
    vasilii.setMarried(true);
    natasha.setName("Natasha");
    natasha.setFamilyName("Ignat");
    natasha.setAge(31);
    natasha.setMarried(true);
    System.out.println("After five years: ");
    System.out.println();
    System.out.println();
    System.out.println(alexei);
    System.out.println(vasilii);
    System.out.println(natasha);
    MyFriend george = new MyFriend(alexei);
    MyFriend.printData(alexei);
    }
}
class Food {
    private String name;
    Food(String name){
        this.name = name;
    }
    String getName(){return name;}


}
class MyFriend{
    private String name;
    private String familyName;
    private int age;
    private boolean married;
    public String getName() {
        return name;
    }
    public String getFamilyName() {
        return familyName;
    }
    public int getAge() {
        return age;
    }
    public boolean isMarried() {
        return married;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMarried(boolean married) {
        this.married = married;
    }
    public MyFriend(String name, String familyName, int age, boolean married) {
        setName(name);
        setFamilyName(familyName);
        setAge(age);
        setMarried(married);
    }
    public MyFriend(MyFriend friend){
        copy(friend);
    }
    public void copy(MyFriend friend){
        setName(friend.getName());
        setFamilyName(friend.getFamilyName());
        setAge(friend.getAge());
        setMarried(friend.isMarried());
    }
    public static void printData(MyFriend friend){
        System.out.printf("Name: %s Family Name: %s Age: %d Married: %b \n",friend.getName(),friend.getFamilyName(), friend.getAge(),friend.isMarried());
    }
}