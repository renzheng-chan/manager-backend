package scu.com.demo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtil {

    //1.将sqlSessionFactory声明为静态变量
    private static SqlSessionFactory sqlSessionFactory;
    //2.在静态代码块里使用sqlSessionFactoryBuilder创建sqlSessionFactory
    static {
        try {
            //加载mybatis核心配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            //将读取的输入流放到sqlSessionFactoryBuilder里创建sqlSessionFactory
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}

