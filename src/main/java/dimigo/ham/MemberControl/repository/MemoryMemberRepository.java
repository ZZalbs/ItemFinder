package dimigo.ham.MemberControl.repository;

import dimigo.ham.MemberControl.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//@Repository
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Integer,Member> mList = new HashMap<>();
    private static int count = 0;

    @Override
    public Member save(Member member) {
        member.setId(++count);
        mList.put(member.getId(),member);
        return member;
    }

    @Override
    public Member findById(int id) {
       return mList.get(id);
    }

    @Override
    public Member findByName(String name) {

        for(Member m : mList.values())
        {
            if(m.getName().equals(name))
                return m;
        }
        return null;
    }

    @Override
    public ArrayList<Member> findAll() {
        return new ArrayList<Member>(mList.values());
    }
}
