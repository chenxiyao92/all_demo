package top.cxy.quickstart;

import org.junit.Test;

import java.sql.*;

/**
 * Created by Administrator on 2017/12/8.
 *
 * @author Jonas chen
 */
public class StandJdbcDemo {

    /**
     * 标准JDBC程序
     */
    @Test
    public void test1() throws ClassNotFoundException, SQLException {

        Connection conn = getConnection("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/quick", "root", "123");
        conn.setAutoCommit(true);
        PreparedStatement preparedStatement = conn.prepareStatement("select * from students where id =?");
        preparedStatement.setString(1,"1");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            jiexi(resultSet);
        }
        conn.commit();


    }

    private void jiexi(ResultSet resultSet) throws SQLException {
        System.out.println(resultSet.getString("name"));
    }

    private Connection getConnection(String driver, String url, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        return DriverManager.getConnection(url, username, password);
    }
}
