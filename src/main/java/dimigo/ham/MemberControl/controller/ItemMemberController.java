package dimigo.ham.MemberControl.controller;

import dimigo.ham.MemberControl.domain.ItemMember;
import dimigo.ham.MemberControl.service.ItemMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;

@Controller
public class ItemMemberController {
    private ItemMemberService is;
    public ItemMemberController(ItemMemberService is){
        this.is=is;
    }
    @GetMapping("/members/new") // 멤버 회원가입창 오픈
    public String registerMember(Model model)
    {
        ArrayList<ItemMember> im = is.findMembers();
        model.addAttribute("items",im);
        return "registerMember";
    }
    @GetMapping("/item") // 아이템 목록 전체를 불러오는 함수
    public String itemList(Model model)
    {
        ArrayList<ItemMember> im = is.findMembers();
        model.addAttribute("list",im);
        return "ItemList";
    }
}
