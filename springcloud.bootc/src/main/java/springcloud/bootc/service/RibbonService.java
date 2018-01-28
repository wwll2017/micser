package springcloud.bootc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService
{
    @Autowired
    private RestTemplate rest;

    public String hiService(String name, int id)
    {
        System.out.println("hiService start.");

        return String.valueOf(rest.getForObject("http://bootp/rest?str=" + name + "&&id=" + id, Object.class));
    }

}
