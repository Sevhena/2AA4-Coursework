package Equipment;

import Product.Armour;

public class ChestPiece implements Armour {
    String rarity;

    public ChestPiece(String rarity){
        this.rarity = rarity;
    }
    @Override
    public String getDescription() {
        return rarity + "Chest Piece\n======================";
    }
}
