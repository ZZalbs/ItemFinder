package dimigo.ham.MemberControl.repository;

import dimigo.ham.MemberControl.domain.Member;

import java.util.ArrayList;

public interface MemberRepository {//Member에 관한 함수를 미리 만들어 놓은 인터페이스

    Member save(Member member);//받은 Member를 db에 저장
    Member findById(int id);//받은 id에 해당하는 Member 반환
    ArrayList<Member> findAll();//모든 Member 반환
}
