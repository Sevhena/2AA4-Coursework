package Bonuses;

import Product.Armour;
import Product.BonusStacker;

public class Intelligence extends BonusStacker {

    public Intelligence(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        String stats = "\n-Intelligence bonus";
        return armour.getDescription() + stats;
    }
}
