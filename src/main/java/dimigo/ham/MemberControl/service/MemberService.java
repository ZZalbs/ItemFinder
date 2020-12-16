package dimigo.ham.MemberControl.service;

import dimigo.ham.MemberControl.domain.Member;
import dimigo.ham.MemberControl.repository.JPAMemberRepository;
import dimigo.ham.MemberControl.repository.MemberRepository;
import dimigo.ham.MemberControl.repository.MemoryMemberRepository;
//import dimigo.ham.MemberControl.repository.SpringDataJPAMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;
import java.util.ArrayList;

//@Service
@Transactional
public class MemberService {

    private MemberRepository memberRepository;
    private EntityManager em;
    private EntityTransaction tx;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public int register(Member m)
    {
        tx=em.getTransaction();
        tx.begin();
        memberRepository.save(m);
        em.persist(m);
        tx.commit();
        return m.getID();
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
