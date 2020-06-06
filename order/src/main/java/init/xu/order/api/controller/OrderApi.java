package init.xu.order.api.controller;

import init.xu.order.orderapiinteface.MemberIntereface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderApi {
      @Autowired
      private RestTemplate restTemplate;
      @Autowired
      private DiscoveryClient discoveryClient;
      @Autowired
      private MemberIntereface memberIntereface;

      @RequestMapping("/getOrder")
      public String getOrder() {
            //需求一  获取会员信息
            //restTemp 方式
            String id = "http://app-xu-member/getMember";
            String forObject = restTemplate.getForObject(id, String.class);

            //feign方式
            String member = memberIntereface.getMember();
            String str = "这里是订单服务 从会员服务中获取到的内容是 %s";
            return String.format(str, member);
      }

      //获取服务实例
      @RequestMapping("/getServerInstance")
      public void getServerInstance() {
            List<ServiceInstance> instances = discoveryClient.getInstances("app-xu-member");
            for (ServiceInstance instance : instances) {
                  System.out.println(instance);
            }
      }
}
