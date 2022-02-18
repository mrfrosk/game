package Armors;

import Items.Item;
import Stats.Stat;
import Stats.StatName;

public class Armor extends Item {
    public Armor(String Alias, double weight, int maxCount, int armorRating) {
        super(Alias, weight, maxCount);
        getItemStats().addStat(new Stat(armorRating,StatName.armorRating));
    }
}
