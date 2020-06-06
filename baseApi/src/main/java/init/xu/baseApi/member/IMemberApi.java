package init.xu.baseApi.member;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IMemberApi {
      @RequestMapping("/getMember")
      public String getMember();
}
