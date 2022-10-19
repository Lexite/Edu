package B3_BroCode.JavaIntro.L82.Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Step to Serialize

        // 1. B2_Oracle.Object class should implement Serializable interface
        // 2. Add import java.io.serializable
        // 3. FileOutputStream fileOut = new FileOutputStream(file path)
        // 4. ObjectOutputStream out = new ObjectOutputStream(fileOut)
        // 5. out.writeObject(objectName)
        // 6. out.close(); fileOut.close()


        User user = new User();
        user.name = "Bro";
        user.password = "I<3Pizza";
        user.sayHello();

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("B2_Oracle.Object info saved :)");
    }
}