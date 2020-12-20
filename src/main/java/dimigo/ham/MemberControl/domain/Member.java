package dimigo.ham.MemberControl.domain;

import javax.persistence.*;

@Entity @Table(name="itemset")//db에 있는 itemset 테이블을 구현
public class Member {

    @Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
    int id;
    String name;
    int itemID1;
    int itemID2;
    int itemID3;
    int itemID4;
    int itemID5;
    int itemID6;

    public int getId() {
        return id;
    }

    public void setId(int ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getItemID1() {
        return itemID1;
    }

    public void setItemID1(int ItemID1) {
        this.itemID1 = ItemID1;
    }

    public int getItemID2() {
        return itemID2;
    }

    public void setItemID2(int ItemID2) {
        this.itemID2 = ItemID2;
    }

    public int getItemID3() {
        return itemID3;
    }

    public void setItemID3(int ItemID3) {
        this.itemID3 = ItemID3;
    }

    public int getItemID4() {
        return itemID4;
    }

    public void setItemID4(int ItemID4) {
        this.itemID4 = ItemID4;
    }

    public int getItemID5() {
        return itemID5;
    }

    public void setItemID5(int ItemID5) {
        this.itemID5 = ItemID5;
    }

    public int getItemID6() {
        return itemID6;
    }

    public void setItemID6(int ItemID6) {
        this.itemID6 = ItemID6;
    }


}
