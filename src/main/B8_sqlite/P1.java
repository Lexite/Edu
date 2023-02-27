package main.B8_sqlite;
import java.sql.*;

public class P1
{
    public static void main (String ... args)
    {
        P1 program = new P1();
        program.open();
        program.select();
        //program.insert();
        program.close();
    }
    Connection co;
    void open()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            co = DriverManager.getConnection(
                    "jdbc:sqlite:c:\\users\\user\\desktop\\sqlite\\users.db");
            System.out.println("Connected");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    /*void insert()

    {
        try
        {
            Scanner scanner = new Scanner (System.in);
            System.out.print("Enter user name: ");
            String name = scanner.nextLine();
            System.out.print("Enter user phone: ");
            String phone = scanner.nextLine();

            String query =
                    "Insert into users (name, phone) " +
                            "Values ('" + name + "', '" + phone + "')";

            Statement statement = co.createStatement();
            statement.executeUpdate(query);

            System.out.println("Rows added");
            statement.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    */
    void select() {
        try {
            Statement statement = co.createStatement();
            String query =
                    "SELECT id, name, phone " +
                    " From users " +
                    "Order by name";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                System.out.println(id + "\t| " + name + "          \t| " + phone);
            }
            rs.close();
            statement.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    void close()
    {
        try
        {
            co.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
