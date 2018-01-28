package springcloud.bootc.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "bootp")
public interface FeignService
{
    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "str") String name, @RequestParam(value = "id") int id);

}
