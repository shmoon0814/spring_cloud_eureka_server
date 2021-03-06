package m.s.h.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudserverApplication {
    //server change and git wehbook test
    public static void main(String[] args) {
        SpringApplication.run(CloudserverApplication.class, args);
    }
}

