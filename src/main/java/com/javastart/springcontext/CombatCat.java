package com.javastart.springcontext;

/**
 * @author Karl
 * @link <a href="https://web.babayan.keenetic.link/">https://web.babayan.keenetic.link</a>
 */
public class CombatCat {

    private String name;

    private Integer strength = 1;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "CombatCat{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }
}
