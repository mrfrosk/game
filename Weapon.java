package Weapons;

import Items.Item;
import Items.UsedItems;
import Stats.Stat;
import Stats.StatName;

public class Weapon extends Item implements UsedItems {

    public Weapon(String Alias, double weight, int count, double damage) {
        super(Alias, weight, count);
        getItemStats().addStat(new Stat(damage, StatName.damage));
    }

    @Override
    public void useItem() {

    }
}
