package springcloud.bootp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
//通过该注解，实现服务发现，注册
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        System.out.println("springboot provid!");
        SpringApplication.run(App.class, args);
    }
}
