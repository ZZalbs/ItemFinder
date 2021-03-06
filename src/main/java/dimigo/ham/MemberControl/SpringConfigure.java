package dimigo.ham.MemberControl;

//import dimigo.ham.MemberControl.repository.JDBCMemberRepository;
import dimigo.ham.MemberControl.repository.ItemMemberRepository;

import dimigo.ham.MemberControl.repository.MemberRepository;
import dimigo.ham.MemberControl.service.ItemMemberService;
import dimigo.ham.MemberControl.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfigure {//MemberRepository와 ItemMemberRepository의 bean 객체 생성

    //private  DataSource dataSource;
    //private  EntityManager em;
    //멤버리포지토리와 아이템멤버리포지토리 bean 객체 생성
    private MemberRepository memberRepository;
    private ItemMemberRepository itemmemberRepository;

    public SpringConfigure(MemberRepository memberRepository, ItemMemberRepository itemmemberRepository) {
        this.memberRepository = memberRepository;
        this.itemmemberRepository=itemmemberRepository;
    }

    @Bean
    public MemberService memberService()
    {
        return new MemberService(memberRepository);
    }
    @Bean
    public ItemMemberService itemmemberService()
    {
        return new ItemMemberService(itemmemberRepository);
    }

    /*
   @Bean
    public MemberRepository memberRepository()
    {
        //return new MemoryMemberRepository();
        //return new JDBCMemberRepository(dataSource);
        return new JPAMemberRepository(em);
    }*/

}
