package dimigo.ham.MemberControl.service;

import dimigo.ham.MemberControl.domain.ItemMember;
import dimigo.ham.MemberControl.repository.ItemMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
public class ItemMemberService {//콘트롤러에서 활용할 ItemMember와 관련된 함수들 구현

    private ItemMemberRepository itemmemberRepository;

    @Autowired
    public ItemMemberService(ItemMemberRepository itemmemberRepository) {
        this.itemmemberRepository = itemmemberRepository;
    }
    public ArrayList<ItemMember> findMembers()
    {
        return itemmemberRepository.findAll();
    }//모든 ItemMember를 찾아 ArrayList<ItemMember> 형태로 반환하는 함수
    public ItemMember findOneMember(int id)
    {
        return itemmemberRepository.findById(id);
    }//받은 id에 해당하는 ItemMember를 반환하는 함수


}
