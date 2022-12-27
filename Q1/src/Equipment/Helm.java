package Equipment;

import Product.Armour;

public class Helm implements Armour {
    String rarity;

    public Helm(String rarity){
        this.rarity = rarity;
    }
    @Override
    public String getDescription() {
        return rarity + "Helm\n=====================";
    }
}
