package dimigo.ham.MemberControl.repository;

import dimigo.ham.MemberControl.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataJpaMemberRepository extends JpaRepository<Member, Integer>, MemberRepository {
}
