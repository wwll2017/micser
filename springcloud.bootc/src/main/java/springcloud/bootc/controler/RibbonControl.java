package springcloud.bootc.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springcloud.bootc.service.FeignService;
import springcloud.bootc.service.RibbonService;

@RestController
public class RibbonControl
{
    @Autowired
    private RibbonService ser;
    @Autowired
    private FeignService serv;

    //http://39.108.185.51:8081/sayhi?str=kkjsll&&id=233
    @RequestMapping(value = "/sayhi")
    public String sayHi(String name, int id)
    {
        System.out.println("sayHi start.");

        return ser.hiService(name, id);
    }

    @RequestMapping(value = "/sayhis")
    public String sayHi2(String name, int id)
    {
        System.out.println("sayHi2 start.");

        return serv.sayHiFromClientOne(name, id);
    }

}
