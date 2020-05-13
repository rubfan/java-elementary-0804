package Lesson7.fihter;

public class FighterMain {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        fighter.setName("Tayson");
        fighter.setAge(30);
        fighter.showInfo();
        fighter.checkSkill();
        fighter.running();
        fighter.sparring();
        fighter.visitGym();
        fighter.rest();
        fighter.checkSkill();
        fighter.showResult();
    }
}
