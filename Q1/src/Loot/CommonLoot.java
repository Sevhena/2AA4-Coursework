package Loot;

import Bonuses.Dexterity;
import Bonuses.StatRepository;
import Equipment.*;
import Factory.AbstractFactory;
import Product.Armour;
import Product.BonusStacker;

import java.util.Random;

public class CommonLoot implements AbstractFactory {
    @Override
    public Armour dropArmour() {
        RandomArmourGen arGen = new RandomArmourGen();
        Armour armour = arGen.getArmour("Common ");

        StatRepository temp = new StatRepository();
        return temp.getRandStat(armour);
    }
}
