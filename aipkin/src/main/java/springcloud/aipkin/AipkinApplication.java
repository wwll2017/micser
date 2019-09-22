package springcloud.aipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class AipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(AipkinApplication.class, args);
    }

}
