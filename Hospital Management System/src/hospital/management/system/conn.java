package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement statement;


    public conn(){

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital_Management_System", "Ankush", "0103");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
