package init.xu.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//表示注册为一个Eureka的服务
//@EnableEurekaClient
@EnableDiscoveryClient
public class OrderApp {

      public static void main(String[] args) {
            SpringApplication.run(OrderApp.class,args);
      }

      @Bean
      @LoadBalanced  //实现本地负载均衡 不然无法使用serverid调用其他服务
      RestTemplate restTemplate() {
            return new RestTemplate();
      }

}
