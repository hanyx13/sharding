package shardingjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shardingjdbc.dao.User;
import shardingjdbc.mapper.UserMapper;

import java.util.Date;

/**
 * @author hanyuxuan
 * @data 2019/9/2
 * @time 10:07
 */
@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/save")
    @ResponseBody
    public String save() {
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("test" + i);
            user.setCityId(i % 2 == 0 ? 0 : 1);
            user.setCreateTime(new Date());
            user.setSex(i % 2 == 0 ? 0 : 1);
            user.setPhone("11111111" + i);
            user.setEmail("xxxxx");
            user.setCreateTime(new Date());
            user.setPassword("123456");
            userMapper.save(user);
        }
        return "success";
    }

    @RequestMapping("/user/get/{id}")
    @ResponseBody
    public User get(@PathVariable Long id) {
        User user = userMapper.get(id);
        System.out.println(user.getId());
        return user;
    }
}
