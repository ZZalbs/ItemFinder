package dimigo.ham.MemberControl.service;

import dimigo.ham.MemberControl.domain.Member;
import dimigo.ham.MemberControl.repository.MemberRepository;
import dimigo.ham.MemberControl.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

//@Service
@Transactional
public class MemberService {

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
    }
    public Member findOneMember(int id)
    {
        return memberRepository.findById(id);
    }
}
