package Bonuses;

import Product.Armour;
import Product.BonusStacker;

import java.util.ArrayList;
import java.util.Random;

/**
 * Central acheivable stat list
 * Has method for random generation of stats
 */
public class StatRepository {

    private ArrayList<BonusStacker> statList;

    public BonusStacker getRandStat(Armour armour){
        buildStatList(armour);
        Random rand = new Random();
        int x = rand.nextInt(getStatListSize());
        return statList.get(x);
    }

    private int getStatListSize(){
        return statList.size();
    }

    private void buildStatList(Armour armour){ //Add new stat bonuses here
        statList = new ArrayList<>();
        statList.add(new Dexterity(armour));
        statList.add(new Intelligence(armour));
        statList.add(new Strength(armour));
    }

}
