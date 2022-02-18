package Items;

import Stats.Stats;
import Stats.Stat;
import Stats.StatName;

public class Item {
    private final String name;
    private final Stats stats = new Stats();
    private ItemType itemType;
    public Item(String Alias, double weight, int maxCount){
        this.name = Alias;
        stats.addStat(new Stat(weight,StatName.weight));
        stats.addStat(new Stat(maxCount,StatName.Count));
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public Stats getItemStats(){
        return stats;
    }
    public ItemType getItemType(){
        return itemType;
    }
}
