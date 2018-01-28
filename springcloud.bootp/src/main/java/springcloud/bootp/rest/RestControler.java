package springcloud.bootp.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springcloud.bootp.model.ResVo;

@RestController
public class RestControler
{

    @RequestMapping(path = {"/rest"}, method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody ResVo sayHi(int id, String str)
    {
        //http://127.0.0.1:8080/rest?id=10&&str=names
        System.out.println("sayHi," + id + "," + str);

        ResVo res = new ResVo();

        res.setId(id);
        res.setStr(str);

        return res;
    }

}
