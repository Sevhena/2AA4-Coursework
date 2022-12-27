import Factory.AbstractFactory;
import Loot.*;
import Product.Armour;

import java.util.Random;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Welcome to the armour generator!\n");
        Random rand = new Random();
        int randNum = rand.nextInt(1001);
        AbstractFactory factory;
        if (randNum % 5 == 0) {
            System.out.println("An Elite has spawned!\n\nGenerating loot...\n");
            System.out.println("Congrats you have received the following:\n");
            factory = new UncommonLoot();
        } else if (randNum % 25 == 0) {
            System.out.println("A Boss enemy has spawned!\n\nGenerating loot...\n");
            System.out.println("Congrats you have received the following:\n");
            factory = new RareLoot();
        } else {
            System.out.println("A minion has spawned!\n\nGenerating loot...\n");
            System.out.println("Congrats you have received the following:\n");
            factory = new CommonLoot();
        }

        Armour drop = factory.dropArmour();
        System.out.println(drop.getDescription());

    }

}