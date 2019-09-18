package shardingjdbc.dao;

import lombok.Data;

/**
 * @author hanyuxuan
 * @data 2019/9/2
 * @time 10:02
 */
@Data
public class Address {
    private Long id;
    private String code;
    private String name;
    private String pid;
    private Integer type;
    private Integer lit;
}
