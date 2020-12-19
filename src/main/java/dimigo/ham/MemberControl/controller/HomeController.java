package dimigo.ham.MemberControl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    // 첫화면에서 선택 화면으로 가는 컨트롤러입니다.
    @GetMapping("/home")
    public String home()
    {
        return "home";
    }
    @PostMapping("/home")
    public String home2()
    {
        return "home";
    }
}
