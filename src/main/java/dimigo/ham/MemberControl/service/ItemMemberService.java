package dimigo.ham.MemberControl.service;

import dimigo.ham.MemberControl.domain.ItemMember;
import dimigo.ham.MemberControl.repository.ItemMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
public class ItemMemberService {

    private ItemMemberRepository itemmemberRepository;

    @Autowired
    public ItemMemberService(ItemMemberRepository itemmemberRepository) {
        this.itemmemberRepository = itemmemberRepository;
    }
    public ArrayList<ItemMember> findMembers()
    {
        return itemmemberRepository.findAll();
    }
    public ItemMember findOneMember(int id)
    {
        return itemmemberRepository.findById(id);
    }


}
