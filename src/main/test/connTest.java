import com.mchange.v2.c3p0.PooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

public class connTest {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        PooledDataSource dataSource = (PooledDataSource) context.getBean("pooledDataSource");
        Connection connection = dataSource.getConnection();
        System.out.printf(String.valueOf(connection));


    }
}
