package init.xu.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//表示注册为一个Eureka的服务
//@EnableEurekaClient
@EnableDiscoveryClient
public class MemberApp {

      public static void main(String[] args) {
            SpringApplication.run(MemberApp.class,args);
      }
}
