package shardingjdbc.mapper;

import org.apache.ibatis.annotations.Mapper;
import shardingjdbc.dao.User;

/**
 * @author hanyuxuan
 * @data 2019/9/2
 * @time 10:05
 */
@Mapper
public interface UserMapper {
    /**
     * 保存
     *
     * @param user
     */
    public void save(User user);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    public User get(Long id);
}
