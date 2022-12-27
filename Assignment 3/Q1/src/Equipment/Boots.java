package Equipment;

import Product.Armour;

public class Boots implements Armour {
    String rarity;

    public Boots(String rarity){
        this.rarity = rarity;
    }
    @Override
    public String getDescription() {
        return rarity + "Boots\n=====================";
    }
}
