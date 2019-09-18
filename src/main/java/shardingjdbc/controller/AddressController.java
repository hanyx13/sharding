package shardingjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shardingjdbc.dao.Address;
import shardingjdbc.mapper.AddressMapper;

/**
 * @author hanyuxuan
 * @data 2019/9/2
 * @time 10:18
 */
@Controller
public class AddressController {
    @Autowired
    private AddressMapper addressMapper;

    @RequestMapping("/address/save")
    @ResponseBody
    public String save() {
        for (int i = 0; i < 10; i++) {
            Address address = new Address();
            address.setCode("code_" + i);
            address.setName("name_" + i);
            address.setPid(i + "");
            address.setType(0);
            address.setLit(i % 2 == 0 ? 0 : 1);
            addressMapper.save(address);
        }
        return "success";
    }

    @RequestMapping("/address/get/{id}")
    @ResponseBody
    public Address get(@PathVariable Long id) {
        return addressMapper.get(id);
    }
}
