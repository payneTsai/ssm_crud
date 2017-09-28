import com.ipeak.crud.dao.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void testCRUD(){
        //测试departmentMapper
//        使用junit来测试  原生测试
//        ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DepartmentMapper bean =  context.getBean(DepartmentMapper.class);
            System.out.print(departmentMapper);
    }
}
