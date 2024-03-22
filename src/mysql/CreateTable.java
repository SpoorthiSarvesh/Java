package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spoorthi",
                    "root", "Spooraki@4");
            Statement stmt = con.createStatement();
            String createTableQuery = "create table students(" +
                    "rollno int," +
                    "name varchar(20), " +
                    "age int);";
            stmt.executeUpdate(createTableQuery);
            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
