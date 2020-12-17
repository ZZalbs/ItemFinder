package dimigo.ham.MemberControl.domain;

import javax.persistence.*;

@Entity @Table(name="item")
public class ItemMember {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

}