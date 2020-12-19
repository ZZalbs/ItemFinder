package dimigo.ham.MemberControl.domain;

import javax.persistence.*;

@Entity @Table(name="item") // 아이템 도메인의 멤버변수 형태입니다.
public class ItemMember {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String text;
    int hp;
    int ad;
    int ap;
    int armor;
    int magic_resistance;
    int cooldown;
    String src;
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setMagic_resistance(int magic_resistance) {
        this.magic_resistance = magic_resistance;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getText() {
        return text;
    }

    public int getHp() {
        return hp;
    }

    public int getAd() {
        return ad;
    }

    public int getAp() {
        return ap;
    }

    public int getArmor() {
        return armor;
    }

    public int getMagic_resistance() {
        return magic_resistance;
    }

    public int getCooldown() {
        return cooldown;
    }

    public String getSrc() {
        return src;
    }



}