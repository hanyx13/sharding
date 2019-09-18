package shardingjdbc.mapper;

import org.apache.ibatis.annotations.Mapper;
import shardingjdbc.dao.Address;

/**
 * @author hanyuxuan
 * @data 2019/9/2
 * @time 10:04
 */
@Mapper
public interface AddressMapper {
    /**
     * 保存
     *
     * @param address 保存的地址
     */
    public void save(Address address);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    public Address get(Long id);
}
