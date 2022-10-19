package B3_BroCode.JavaIntro.L82.Deserialization;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String password;

    public void sayHello(){
        System.out.println("Hello"  + name);
    }

}
