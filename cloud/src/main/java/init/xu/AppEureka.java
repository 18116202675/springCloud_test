package init.xu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//整合Eureka
//@EnableEurekaServer
//整合Zookeeper        本地需要先启动zookeeper服务端
//@Enabledis
public class AppEureka {

//      @EnableEurekaServer   开启Eureka 服务  注册中心
      public static void main(String[] args) {

            SpringApplication.run(AppEureka.class,args);

            System.out.println("Eureka Hello !");

      }


}
