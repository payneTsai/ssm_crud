import com.ipeak.crud.dao.DepartmentMapper;
import com.ipeak.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import java.util.UUID;

/**
 * Created by payne on 2017/9/18.
 */
//使用spring单元测试，自动注入我们需要的组件
//    @ContextConfiguration指定spring配置文件的位置
//    直接autowrite来自动装配

//    指定使用哪个组件来进行测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MappertTest {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD(){
        //测试departmentMapper
//        使用junit来测试  原生测试
//        ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DepartmentMapper bean =  context.getBean(DepartmentMapper.class);
//            System.out.print(departmentMapper);
//        departmentMapper.insertSelective(new Department(null,"开发部"));
//        departmentMapper.insertSelective(new Department(null,"测试部"));
//        System.out.print(employeeMapper);

//        employeeMapper.insertSelective(new Employee(null,"jerry","M","jerry@qq.com",1));
//        employeeMapper.insertSelective(new Employee(null,"peter","M","peter@qq.com",2));
//        employeeMapper.insertSelective(new Employee(null,"mike","M","mike@qq.com",1));

//        批量插入数据，用于测试

//        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//         for (int i = 0;i<1000;i++){
//             String uid = UUID.randomUUID().toString().substring(0,5)+""+i;
//             mapper.insertSelective(new Employee(null,uid,"M",uid+"@qq.com",1));
//         }
//        System.out.println("success");
        System.out.println(employeeMapper.selectByExampleWithDept(null));
    }
}
