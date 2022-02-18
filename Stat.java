package Stats;

public class Stat {
    private double currentValue, maxValue;
    private StatName statName;
    public Stat( double maxValue, StatName statName){
        this.maxValue = maxValue;
        currentValue = this.maxValue;
        this.statName = statName;
    }
    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public StatName getStatName() {
        return statName;
    }
}
