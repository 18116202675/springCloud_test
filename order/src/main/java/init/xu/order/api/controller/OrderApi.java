package init.xu.order.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderApi {
      @Autowired
      private RestTemplate restTemplate;

      @RequestMapping("/getOrder")
      public String getOrder() {
            //需求一  获取会员信息
            String id = "http://app-xu-member/getMember";
            String forObject = restTemplate.getForObject(id, String.class);
            String str = "这里是订单服务 从会员服务中获取到的内容是 %s";
            return String.format(str, forObject);
      }
}
