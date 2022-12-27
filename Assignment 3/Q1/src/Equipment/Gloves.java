package Equipment;

import Product.Armour;

public class Gloves implements Armour {
    String rarity;

    public Gloves(String rarity){
        this.rarity = rarity;
    }
    @Override
    public String getDescription() {
        return rarity + "Gloves\n===========================";
    }
}
