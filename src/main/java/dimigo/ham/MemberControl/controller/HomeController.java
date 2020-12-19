package dimigo.ham.MemberControl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 첫화면에서 선택 화면으로 가는 컨트롤러입니다.
    @GetMapping("/home")
    public String home()
    {
        return "home";
    }
}
