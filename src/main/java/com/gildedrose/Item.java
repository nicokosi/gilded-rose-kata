package com.gildedrose;

public class Item {

    public String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.setSellIn(sellIn);
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.getSellIn() + ", " + this.getQuality();
    }

    public int getQuality() {
        return quality;
    }

    public void decreaseQuality() {
        quality -= 1;
    }

    public void increaseQuality() {
        quality -= 1;
    }

    public void resetQuality() {
        quality = 0;
    }

    public int getSellIn() {
        return sellIn;
    }

    @Deprecated()
    public void setSellIn(int sellIn) {
        decreaseSellIn();
    }

    public void decreaseSellIn() {
        this.sellIn -= 1;
    }
}
