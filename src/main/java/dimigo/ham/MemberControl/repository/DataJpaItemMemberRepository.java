package dimigo.ham.MemberControl.repository;

import dimigo.ham.MemberControl.domain.ItemMember;
import org.springframework.data.jpa.repository.JpaRepository;
//상속받은 ItemMemberRepository를 바탕으로 ItemMember와 관련된 빈을 자동으로 만드는 인터페이스
public interface DataJpaItemMemberRepository extends JpaRepository<ItemMember, Integer>, ItemMemberRepository {
}
