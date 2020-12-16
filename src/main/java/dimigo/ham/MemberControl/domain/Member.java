package dimigo.ham.MemberControl.domain;

import javax.persistence.*;

@Entity @Table(name="itemset")
public class Member {

    @Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
    int ID;
    String Name;
    int ItemID1;
    int ItemID2;
    int ItemID3;
    int ItemID4;
    int ItemID5;
    int ItemID6;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getItemID1() {
        return ItemID1;
    }

    public void setItemID1(int ItemID1) {
        this.ItemID1 = ItemID1;
    }

    public int getItemID2() {
        return ItemID2;
    }

    public void setItemID2(int ItemID2) {
        this.ItemID2 = ItemID2;
    }

    public int getItemID3() {
        return ItemID3;
    }

    public void setItemID3(int ItemID3) {
        this.ItemID3 = ItemID3;
    }

    public int getItemID4() {
        return ItemID4;
    }

    public void setItemID4(int ItemID4) {
        this.ItemID4 = ItemID4;
    }

    public int getItemID5() {
        return ItemID5;
    }

    public void setItemID5(int ItemID5) {
        this.ItemID5 = ItemID5;
    }

    public int getItemID6() {
        return ItemID6;
    }

    public void setItemID6(int ItemID6) {
        this.ItemID6 = ItemID6;
    }


}
