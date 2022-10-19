package B1_Start.SimpleExamples;

public class Encapsulation {

        public static void main(String[] args) {

            Person kate = new Person("Kate", 30);
            System.out.println(kate.getAge());      // 30
            kate.setAge(33);
            System.out.println(kate.getAge());      // 33
            kate.setAge(123450);
            System.out.println(kate.getAge());      // 33
        }
    }
    class Person{

        private String name;
        private int age = 1;

        public Person(String name, int age){

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
        public void setAge(int age){
            if(age > 0 && age < 110)
                this.age = age;
        }
    }
