package Loot;

import Bonuses.StatRepository;
import Factory.AbstractFactory;
import Product.Armour;

public class UncommonLoot implements AbstractFactory {
    @Override
    public Armour dropArmour() {
        RandomArmourGen arGen = new RandomArmourGen();
        Armour armour = arGen.getArmour("Uncommon ");

        StatRepository temp = new StatRepository();
        armour = temp.getRandStat(armour);
        armour = temp.getRandStat(armour);
        return armour;
    }

}
