package init.xu.order.orderapiinteface;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//其他服务的服务名称
@FeignClient("app-xu-member")
public interface MemberIntereface {

      @RequestMapping("/getMember")
      public String getMember();

}
