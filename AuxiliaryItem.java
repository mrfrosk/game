package AuxiliaryItems;

import Items.Item;
import Items.UsedItems;

public class AuxiliaryItem extends Item implements UsedItems {
    public AuxiliaryItem(String Alias, double weight, int maxCount) {
        super(Alias, weight, maxCount);
    }

    @Override
    public void useItem() {

    }
}
