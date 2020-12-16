package dimigo.ham.MemberControl.repository;

import dimigo.ham.MemberControl.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;
import java.util.ArrayList;

//@Repository
@Transactional
public class JPAMemberRepository implements MemberRepository {

    private EntityManager em;

    public JPAMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(member);
        tx.commit();
        return member;
    }

    @Override
    public Member findById(int id) {
        Member m = em.find(Member.class, id);
        return m;
    }

    @Override
    public Member findByName(String name) {
        ArrayList<Member> list = (ArrayList) em.createQuery
                ("select m from Member m where m.name = :name ", Member.class)
                .setParameter("name", name).getResultList();
        if (list.size() != 0)
            return list.get(0);
        else
            return null;
    }

    @Override
    public ArrayList<Member> findAll() {
        return (ArrayList) em.createQuery
                ("select m from Member m", Member.class).getResultList();
    }
}
