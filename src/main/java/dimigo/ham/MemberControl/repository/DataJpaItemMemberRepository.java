package dimigo.ham.MemberControl.repository;

import dimigo.ham.MemberControl.domain.ItemMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataJpaItemMemberRepository extends JpaRepository<ItemMember, Integer>, ItemMemberRepository {
}
