package shardingjdbc.dao;

import lombok.Data;

import java.util.Date;

/**
 * @author hanyuxuan
 * @data 2019/9/2
 * @time 10:00
 */
@Data
public class User {
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String password;
    private Integer cityId;
    private Date createTime;
    private Integer sex;
}
