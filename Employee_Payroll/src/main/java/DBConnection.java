import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;



public class DBConnection {
    public static void main(String[] args) {
        String jdbcURL="jdbc:mysql//localhost:3306/payroll_service?useSSL=false";
        String userName="root";
        String password="";
        Connection con;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        listDrivers();
        try {
            System.out.println("Connecting to database:"+jdbcURL);

            con= DriverManager.getConnection(jdbcURL,userName,password);
            System.out.println("Connection is Successful"+con);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    private static void listDrivers(){
        Enumeration<Driver> driverList=DriverManager.getDrivers();
        while(driverList.hasMoreElements()){
            Driver driverClass=driverList.nextElement();
            System.out.println(" "+driverClass.getClass().getName());
        }
    }
}
