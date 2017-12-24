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

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/quick", "root", "123");
        conn.setAutoCommit(false);
        PreparedStatement preparedStatement = conn.prepareStatement("select * from students where id =?");
        preparedStatement.setString(1,"1");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        conn.commit();


    }
}
