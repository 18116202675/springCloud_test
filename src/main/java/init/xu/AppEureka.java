package init.xu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppEureka {

//      @EnableEurekaServer   开启Eureka 服务  注册中心
      public static void main(String[] args) {

            SpringApplication.run(AppEureka.class,args);

            System.out.println("Eureka Hello !");

      }


}
