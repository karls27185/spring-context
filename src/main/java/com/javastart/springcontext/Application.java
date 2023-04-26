package com.javastart.springcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Karl
 * @link <a href="https://web.babayan.keenetic.link/">https://web.babayan.keenetic.link</a>
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        FightClub fightClub = context.getBean(FightClub.class);
        fightClub.fight();
    }
}
