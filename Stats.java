package Stats;

import java.util.HashMap;

public class Stats {
    private HashMap<StatName, Stat>  stat = new HashMap<>();

    public HashMap<StatName, Stat> getStat() {
        return stat;
    }
    public Stat getConcreteStat(StatName name){
        return stat.get(name);
    }
    public void addStat(Stat ... addedStat){
        for (Stat i:addedStat
             ) {
            stat.put(i.getStatName(),i);
        }
    }
}
