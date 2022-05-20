import java.sql.*;
public class jdd {
    public static void main(String[] args) {
        try{
            Class.forName("com.nysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("url://localhost");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while(rs.next())
            System.out.println(rs.getInt(1));
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
