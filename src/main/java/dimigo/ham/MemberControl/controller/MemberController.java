package dimigo.ham.MemberControl.controller;

import dimigo.ham.MemberControl.domain.ItemMember;
import dimigo.ham.MemberControl.domain.Member;
import dimigo.ham.MemberControl.service.MemberService;
import dimigo.ham.MemberControl.service.ItemMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class MemberController {

    private  MemberService ms;
    private ItemMemberService is;

    public MemberController(MemberService ms,ItemMemberService is) {
        this.ms = ms;
        this.is=is;
    }

    @GetMapping("/members/new") // 멤버 회원가입창 오픈
    public String registerMember()
    {
        return "registerMember";
    }

    @PostMapping("/members/new") // 멤버 회원가입 함수
    public String register(MemberForm mf)
    {
        Member m = new Member();
        m.setName(mf.getName());
        m.setItemID1(mf.getItemID1());
        m.setItemID2(mf.getItemID2());
        m.setItemID3(mf.getItemID3());
        m.setItemID4(mf.getItemID4());
        m.setItemID5(mf.getItemID5());
        m.setItemID6(mf.getItemID6());
        //m애는 mf의 받아온 값이 들어가있음
        ms.register(m);
        System.out.println(1);

        return "redirect:/home"; // home 화면으로 복귀
    }

    @GetMapping("/members") // 멤버 전체를 불러오는 함수
    public String memberList(Model model)
    {
        ArrayList<Member> m = ms.findMembers();
        model.addAttribute("list",m);
        return "memberList";
    }

    @GetMapping("/members/modify") // 멤버 회원가입창 오픈
    public String modifyMember()
    {
        return "modifyMember";
    }

    @PostMapping("/members/modify") // 멤버 회원가입 함수
    public String modifyMember(MemberForm mf,Model model)
    {
        ArrayList<Member> mlist = ms.findMembers();
        model.addAttribute("list",mlist);
        Member m = ms.findOneMember(mf.getID());
        if(m!=null) {
            m.setItemID1(mf.getItemID1());
            m.setItemID2(mf.getItemID2());
            m.setItemID3(mf.getItemID3());
            m.setItemID4(mf.getItemID4());
            m.setItemID5(mf.getItemID5());
            m.setItemID6(mf.getItemID6());
            //m애는 mf의 받아온 값이 들어가있음
        }
        else System.out.println("해당 멤버는 존재하지 않습니다.");
        return "redirect:/home"; // home 화면으로 복귀
    }

    @GetMapping("/item") // 아이템 목록 전체를 불러오는 함수
    public String itemList(Model model)
    {
        ArrayList<ItemMember> im = is.findMembers();
        model.addAttribute("list",im);
        return "ItemList";
    }

}
