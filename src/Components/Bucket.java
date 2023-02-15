package Components;

public class Bucket {
    private int limit;
    private int currentAmount;
    private String typeOfLiquid;

    public Bucket(int limit, int currentAmount, String typeOfLiquid) {
        this.limit = limit;
        this.currentAmount = currentAmount;
        this.typeOfLiquid = typeOfLiquid;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String getTypeOfLiquid() {
        return typeOfLiquid;
    }

    public void setTypeOfLiquid(String typeOfLiquid) {
        this.typeOfLiquid = typeOfLiquid;
    }
}
