package dimigo.ham.MemberControl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {
    // 처음 화면으로 되돌아가는 컨트롤러
    @GetMapping("/")
    public String first()
    {
        return "FirstFile";
    }
}
