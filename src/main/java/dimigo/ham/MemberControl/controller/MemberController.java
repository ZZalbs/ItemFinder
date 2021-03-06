package dimigo.ham.MemberControl.controller;

import dimigo.ham.MemberControl.domain.ItemMember;
import dimigo.ham.MemberControl.domain.Member;
import dimigo.ham.MemberControl.service.MemberService;
import dimigo.ham.MemberControl.service.ItemMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MemberController {

    private  MemberService ms;
    private ItemMemberService is;

    public MemberController(MemberService ms,ItemMemberService is) {//생성자
        this.ms = ms;
        this.is=is;
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
    public String memberList(Model model) {
        ArrayList<Member> m = ms.findMembers();
        ArrayList<ItemMember> im = is.findMembers();
        ArrayList<ItemMember> I = new ArrayList<ItemMember>();

        for (int j=0;j<m.size();j++) {

            I.add(is.findOneMember(m.get(j).getItemID1()));
            I.add(is.findOneMember(m.get(j).getItemID2()));
            I.add(is.findOneMember(m.get(j).getItemID3()));
            I.add(is.findOneMember(m.get(j).getItemID4()));
            I.add(is.findOneMember(m.get(j).getItemID5()));
            I.add(is.findOneMember(m.get(j).getItemID6()));
            //Ghost g1=new Ghost(m.get(j),I);
            //g.add(g1);

        }
        System.out.println(I.get(0).getId());
        model.addAttribute("items",I);
        model.addAttribute("list",m);

        return "memberList";//memberList.html 으로 이동
    }

    @GetMapping("/members/modify") // 멤버 회원가입창 오픈
    public String modifyMember(Model model)
    {
        ArrayList<Member> m = ms.findMembers();
        model.addAttribute("list",m);
        return "modifyMember";//modifyMember.html 으로 이동
    }

    @PostMapping("/members/modify") // 멤버 회원가입 함수
    public String modifyMember(Model model,MemberForm mf)
    {
        ArrayList<Member> m1 = ms.findMembers();
        model.addAttribute("list",m1);
        Member m = ms.findOneMember(mf.getID());
        if(m!=null) {
            m.setName(mf.getName());
            m.setItemID1(mf.getItemID1());
            m.setItemID2(mf.getItemID2());
            m.setItemID3(mf.getItemID3());
            m.setItemID4(mf.getItemID4());
            m.setItemID5(mf.getItemID5());
            m.setItemID6(mf.getItemID6());
            //m애는 mf의 받아온 값이 들어가있음
            ms.register(m);
        }
        else System.out.println("해당 멤버는 존재하지 않습니다.");
        return "redirect:/home"; // home 화면으로 복귀
    }

    @PostMapping("/member/check") // 멤버 아이템 세트 확인창
    public String checkMember(Model model, @RequestParam(value="id") int id)
    {
        ArrayList<Member> m=ms.findMembers();
        id--;
        ArrayList<ItemMember> I = new ArrayList<ItemMember>();
        I.add(is.findOneMember(m.get(id).getItemID1()));
        I.add(is.findOneMember(m.get(id).getItemID2()));
        I.add(is.findOneMember(m.get(id).getItemID3()));
        I.add(is.findOneMember(m.get(id).getItemID4()));
        I.add(is.findOneMember(m.get(id).getItemID5()));
        I.add(is.findOneMember(m.get(id).getItemID6()));
        model.addAttribute("items",I);
        return "MemberCheck"; //MemberCheck.html 으로 이동
    }



}
