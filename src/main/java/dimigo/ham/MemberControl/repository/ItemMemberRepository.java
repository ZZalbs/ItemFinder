package dimigo.ham.MemberControl.repository;
import dimigo.ham.MemberControl.domain.ItemMember;

import java.util.ArrayList;
public interface ItemMemberRepository {
    ItemMember findById(int id);
    ArrayList<ItemMember> findAll();
}
