package dimigo.ham.MemberControl.service;

import dimigo.ham.MemberControl.domain.Member;
import dimigo.ham.MemberControl.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
public class MemberService {//콘트롤러에서 활용할 Member와 관련된 함수들 구현

    private MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public int register(Member m)
    {
        memberRepository.save(m);
        return m.getId();
    }
    public ArrayList<Member> findMembers()
    {
        return memberRepository.findAll();
    }//모든 Member를 찾아 ArrayList<Member> 형태로 반환하는 함수
    public Member findOneMember(int id)
    {
        return memberRepository.findById(id);
    }//받은 id에 해당하는 Member를 반환하는 함수


    }
