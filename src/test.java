import java.sql.*;

public class test {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Sri2008prabu@";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM student";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " " + name + " " + age);
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}