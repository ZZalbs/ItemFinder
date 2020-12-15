package dimigo.ham.MemberControl.repository;

import dimigo.ham.MemberControl.domain.Member;

import javax.persistence.EntityManager;
import java.util.ArrayList;

public class JPAMemberRepository implements MemberRepository{

    private EntityManager em;

    public JPAMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Member findById(int id) {
       Member m = em.find(Member.class,id);
       return m;
    }

    @Override
    public Member findByName(String name) {
      ArrayList<Member> list = (ArrayList)em.createQuery
                ("select m from Member m where m.name = :name ",Member.class)
              .setParameter("name",name).getResultList();
      if(list.size() != 0)
          return list.get(0);
      else
          return null;
    }

    @Override
    public ArrayList<Member> findAll() {
        return (ArrayList)em.createQuery
                ("select m from Member m",Member.class).getResultList();
    }
}
