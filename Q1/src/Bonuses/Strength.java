package Bonuses;

import Product.Armour;
import Product.BonusStacker;

public class Strength extends BonusStacker {

    public Strength(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        String stats = "\n-Strength bonus";
        return armour.getDescription() + stats;
    }

}
