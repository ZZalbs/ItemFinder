package dimigo.ham.MemberControl.controller;

import dimigo.ham.MemberControl.domain.Member;
import dimigo.ham.MemberControl.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class MemberController {

    private  MemberService ms;

    public MemberController(MemberService ms) {
        this.ms = ms;
    }

    @GetMapping("/members/new")
    public String registerMember()
    {
        return "registerMember";
    }

    @PostMapping("/members/new")
    public String register(MemberForm mf)
    {
       Member m = new Member();
       m.setName(mf.getName());
       ms.register(m);
       return "redirect:/";
    }
    @GetMapping("/members")
    public String memberList(Model model)
    {
        ArrayList<Member> m = ms.findMembers();
        model.addAttribute("list",m);
        return "memberList";
    }
}
