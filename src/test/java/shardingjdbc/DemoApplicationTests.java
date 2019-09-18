package shardingjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import shardingjdbc.dao.Address;
import shardingjdbc.dao.User;
import shardingjdbc.mapper.AddressMapper;
import shardingjdbc.mapper.UserMapper;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    AddressMapper addressMapper;

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 5; i++) {
            Address address = new Address();
            address.setCode("code_" + i);
            address.setName("name_" + i);
            address.setPid(i + "");
            address.setType(0);
            address.setLit(i % 2 == 0 ? 0 : 1);
            addressMapper.save(address);
        }
    }

    @Test
    public void test1() {
        for (int i = 0; i < 2; i++) {
            User user = new User();
            user.setName("test" + i);
            user.setCityId(3);
            user.setCreateTime(new Date());
            user.setSex(6);
            user.setPhone("11111111" + i);
            user.setEmail("xxxxx");
            user.setCreateTime(new Date());
            user.setPassword("123456");
            userMapper.save(user);
        }
    }
    @Test
    public void test2() {
        User user = userMapper.get(381111045881593856L);
        System.out.println(user);
    }

}
