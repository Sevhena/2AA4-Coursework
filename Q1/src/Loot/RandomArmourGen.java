package Loot;

import Equipment.*;
import Product.Armour;

import java.util.Random;

/**
 * Randomly generates a base Armour type
 * Also acts as central list for all possible Armours
 */
public class RandomArmourGen {
    private int numArmourType = 5; //Number of existing types of armour

    public Armour getArmour(String rarity){
        Random rand = new Random();
        int armour = rand.nextInt(numArmourType);
        switch(armour+1) { //Add new Armour concrete classes here
            case 1:
                return new Helm(rarity);
            case 2:
                return new ChestPiece(rarity);
            case 3:
                return new Gloves(rarity);
            case 4:
                return new Boots(rarity);
            case 5:
                return new Pauldrons(rarity);
            default:
                return null;
        }
    }
}
