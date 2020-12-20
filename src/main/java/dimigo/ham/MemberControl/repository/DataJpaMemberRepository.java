package dimigo.ham.MemberControl.repository;

import dimigo.ham.MemberControl.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
//상속받은 MemberRepository를 바탕으로 Member와 관련된 빈을 자동으로 만드는 인터페이스
public interface DataJpaMemberRepository extends JpaRepository<Member, Integer>, MemberRepository {
}
