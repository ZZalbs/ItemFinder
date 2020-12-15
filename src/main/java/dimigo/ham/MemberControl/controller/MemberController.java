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
       m.setId1(mf.getId1());
       m.setId2(mf.getId2());
       m.setId3(mf.getId3());
       m.setId4(mf.getId4());
       m.setId5(mf.getId5());
       m.setId6(mf.getId6());
       ms.register(m);
       return "redirect:/home";
    }
    @GetMapping("/members")
    public String memberList(Model model)
    {
        ArrayList<Member> m = ms.findMembers();
        model.addAttribute("list",m);
        return "memberList";
    }
}
