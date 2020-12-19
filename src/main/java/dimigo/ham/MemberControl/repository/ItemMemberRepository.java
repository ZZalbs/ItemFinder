package dimigo.ham.MemberControl.repository;
import dimigo.ham.MemberControl.domain.ItemMember;
import dimigo.ham.MemberControl.domain.Member;

import java.util.ArrayList;
public interface ItemMemberRepository {
    ItemMember save(ItemMember im);
    ItemMember findById(int id);
    ArrayList<ItemMember> findAll();
}
