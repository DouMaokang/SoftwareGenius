package softwareGenius.model;

import softwareGenius.service.AccountService;

public class Character {
    private Integer charId;
    private Integer userId;
    private Category charName;
    private Integer exp;
    private Integer level;
    private Integer attackPt;
    /** number of correctly answered question **/
    private Integer correctQuesNo;
    /** number of answered question **/
    private Integer totalQuesNo;

    public Character(){}

    public Character(Integer charId, Integer userId, Category charName, Integer exp, Integer level, Integer attackPt,
                     Integer correctQuesNo, Integer totalQuesNo) {
        this.charId = charId;
        this.userId = userId;
        this.charName = charName;
        this.exp = exp;
        this.level = level;
        this.attackPt = attackPt;
        this.correctQuesNo = correctQuesNo;
        this.totalQuesNo = totalQuesNo;
    }

    public Character(Integer userId, Category charName, Integer exp, Integer level, Integer attackPt,
                     Integer correctQuesNo, Integer totalQuesNo) {
        this.userId = userId;
        this.charName = charName;
        this.exp = exp;
        this.level = level;
        this.attackPt = attackPt;
        this.correctQuesNo = correctQuesNo;
        this.totalQuesNo = totalQuesNo;
    }

    public Integer getCharId() {
        return charId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setCharId(Integer charId) {
        this.charId = charId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setCharName(Category charName) {
        this.charName = charName;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setAttackPt(Integer attackPt) {
        this.attackPt = attackPt;
    }

    public void setCorrectQuesNo(Integer correctQuesNo) {
        this.correctQuesNo = correctQuesNo;
    }

    public void setTotalQuesNo(Integer totalQuesNo) {
        this.totalQuesNo = totalQuesNo;
    }

    public Category getCharName() {
        return charName;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Integer getAttackPt() {
        return attackPt;
    }

    public void setAttackPt(int attackPt) {
        this.attackPt = attackPt;
    }

    public Integer getCorrectQuesNo() {
        return correctQuesNo;
    }

    public void setCorrectQuesNo(int correctQuesNo) {
        this.correctQuesNo = correctQuesNo;
    }

    public Integer getTotalQuesNo() {
        return totalQuesNo;
    }

    public void setTotalQuesNo(int totalQuesNo) {
        this.totalQuesNo = totalQuesNo;
    }

}
