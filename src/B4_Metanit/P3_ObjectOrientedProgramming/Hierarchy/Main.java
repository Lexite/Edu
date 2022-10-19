package B4_Metanit.P3_ObjectOrientedProgramming.Hierarchy;
public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        Person bob = new Client("Bob", "DeutscheBank", 3000);

        Object tom1 = new Person("Tom");
        Object sam1 = new Employee("sam", "Oracle");
        Object kate = new Client("Kate", "DeutscheBank", 2000);
        Person bob1 = new Client("Bob", "DeutscheBank", 3000);
        Person alice = new Employee("Alice", "Google");

        Object sam2 = new Employee("Sam", "Oracle");

        Employee emp = (Employee) sam2;
        emp.display();
        System.out.println(emp.getCompany());

        Object kate2 = new Client("Kate", "DeutscheBank", 2000);
        ((Person) kate2).display();

        Object sam3 = new Employee("Sam", "Oracle");
        ((Employee) sam3).display();

        //B2_Oracle.Object kate3 = new Client("Kate", "DeutscheBank", 2000);
        //Employee emp1 = (Employee) kate3;
        //emp1.display();
        //((Employee)kate3).display();

        Object kate4 = new Client("kate", "DeutscheBank", 2000);
        if (kate4 instanceof Employee) {
            Employee employeeKate = (Employee) kate4;
            employeeKate.display();
        } else {
            System.out.println("conversion is invalid");
        }

        Object kate5 = new Client("Kate", "DeutscheBank", 2000);
        if (kate5 instanceof Client) {
            Client clientKate5 = (Client) kate5;
            clientKate5.display();
        } else {
            System.out.println("conversion is invalid");
        }

        Object andrei = new Client("Andrei", "Eximbank", 2000);
        if (andrei instanceof Client clientAndrei) {
            clientAndrei.display();
        }
        else {
            System.out.println("Conversion is impossible");
        }
    }

}
class Person {
    private String name;
    public String getName() {
        return name;
    }
    public Person(String name) {
        this.name = name;
    }
    public void display() {
        System.out.printf("Person %s \n", name);
    }
}
class Employee extends Person {
    private String company;
    public String getCompany() {
        return company;
    }
    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }
    public void display() {
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}
class Client extends Person {
    private int sum;
    private String bank;
    public Client(String name, String bank, int sum) {
        super(name);
        this.bank = bank;
        this.sum = sum;
    }
    public void display() {
        System.out.printf("Client %s has account in %s \n", super.getName(),bank);
    }
    public String getBank() {
        return bank;
    }
    public int getSum() {
        return sum;
    }
}