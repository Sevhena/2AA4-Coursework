package Equipment;

import Product.Armour;

public class Pauldrons implements Armour {
    String rarity;

    public Pauldrons(String rarity){
        this.rarity = rarity;
    }
    @Override
    public String getDescription() {
        return rarity + "Pauldrons\n=====================";
    }
}
