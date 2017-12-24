package top.cxy.quickstart;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.cxy.pojo.Student;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/12/8.
 */
public class MybatiesDemo {
    public static void main(String[] args) throws Exception {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();

        Student o = session.selectOne("StudentMapper.selectStudent");

        System.out.println(o);
    }
}
