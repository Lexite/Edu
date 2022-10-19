package Learning.FirstLearnign.ClassesAndObjectOrientedProgramming.AccessModifiers;

public class AccessModifiersExample1 {
    public static void main(String[] args) {
        AccessModifiers1 kate = new AccessModifiers1("Kate", 32, "Baker Street", "069034990");
        kate.displayName();
        kate.displayAge();
        kate.displayPhone();
        // kate.displayAddress() - private

        System.out.println(kate.name);
        System.out.println(kate.address);
        System.out.println(kate.age);
        // sout(kate.phone) - private

        School puskin = new School();
        School gogol = new School("Gogol");
        School tolstoi = new School("Tolstoi", 3);

        puskin.displayInfo();
        gogol.displayInfo();
        tolstoi.displayInfo();




    }
}

class AccessModifiers1 {

    String name;
    protected int age;
    public String address;
    private String phone;

    public AccessModifiers1(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName() {
        System.out.printf("Name: %s \n", name);
    }

    void displayAge() {
        System.out.printf("Age: %d \n", age);
    }

    private void displayAddress() {
        System.out.printf("Address: %s \n", address);
    }

    protected void displayPhone() {
        System.out.printf("Phone: %s \n", phone);
    }
}
class School {
    String name;
    int number;
    School() {
        name = "Puskin";
        number = 1;
    }
    School(String name) {
        this.name = name;
        number = 2;
    }
    School(String name, int number) {
        this.name = name;
        this.number = number;
    }

    void displayInfo() {
        System.out.println("School name is: " + name);
        System.out.println("School number is: " + number);
    }
}
