package dimigo.ham.MemberControl.controller;
//아이템과 관련된 멤버 입력값을 받는 곳
public class ItemMemberForm {
    private int id;
    private String name;
    private String text;
    private int hp;
    private int ad;
    private int ap;
    private int armor;
    private int magic_resistance;
    private int cooldown;
    private String src;
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
