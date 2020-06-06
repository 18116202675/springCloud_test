package init.xu.member.api.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//  会员服务
@RestController
public class MemberApi {

      @RequestMapping("/getMember")
      public String getMember(){
            return "你好 这里是会员服务";
      }
}
