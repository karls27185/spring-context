package com.javastart.springcontext;

/**
 * @author Karl
 * @link <a href="https://web.babayan.keenetic.link/">https://web.babayan.keenetic.link</a>
 */

public class FightClubImpl implements FightClub {

    private CombatCat loriCat;

    private CombatCat baxterCat;

    @Override
    public void fight() {
        System.out.println("First cat " + loriCat.toString());
        System.out.println("Second cat " + baxterCat.toString());
    }

    public void setLoriCat(CombatCat loriCat) {
        this.loriCat = loriCat;
    }

    public void setBaxterCat(CombatCat baxterCat) {
        this.baxterCat = baxterCat;
    }
}
