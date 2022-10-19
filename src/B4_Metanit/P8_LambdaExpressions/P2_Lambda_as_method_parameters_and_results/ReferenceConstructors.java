package B4_Metanit.P8_LambdaExpressions.P2_Lambda_as_method_parameters_and_results;

public class ReferenceConstructors {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Tom");
        System.out.println(user.getName());

    }
}

interface UserBuilder{
    User create(String name);
}

class User{
    private String name;
    String getName(){return name;}
    User(String name){this.name = name;}
}
