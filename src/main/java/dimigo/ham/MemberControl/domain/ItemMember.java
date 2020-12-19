package dimigo.ham.MemberControl.domain;

import javax.persistence.*;

@Entity @Table(name="item") // 아이템 도메인의 멤버변수 형태입니다.
public class ItemMember {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

}