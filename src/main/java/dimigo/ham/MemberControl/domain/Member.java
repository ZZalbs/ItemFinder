package dimigo.ham.MemberControl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

    @Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
    int id;
    String name;
    int id1;
    int id2;
    int id3;
    int id4;
    int id5;
    int id6;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public int getId3() {
        return id3;
    }

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public int getId4() {
        return id4;
    }

    public void setId4(int id4) {
        this.id4 = id4;
    }

    public int getId5() {
        return id5;
    }

    public void setId5(int id5) {
        this.id5 = id5;
    }

    public int getId6() {
        return id6;
    }

    public void setId6(int id6) {
        this.id6 = id6;
    }


}
