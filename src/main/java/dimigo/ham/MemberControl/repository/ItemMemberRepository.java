package dimigo.ham.MemberControl.repository;
import dimigo.ham.MemberControl.domain.ItemMember;

import java.util.ArrayList;
public interface ItemMemberRepository {//ItemMember에 관한 함수를 미리 만들어 놓은 인터페이스
    ItemMember findById(int id);//입력된 id에 해당하는 ItemMember를 반환하는 함수
    ArrayList<ItemMember> findAll();//모든 ItemMember를 반환하는 함수
}
