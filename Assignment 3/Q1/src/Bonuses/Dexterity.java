package Bonuses;

import Product.Armour;
import Product.BonusStacker;

public class Dexterity extends BonusStacker {

    public Dexterity(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        String stats  = "\n-Dexterity bonus";
        return armour.getDescription() + stats;
    }
}
