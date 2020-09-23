package com.gildedrose;

public class Item {

    String name;

    private int sellIn;

    private int quality;

    Item(String name, int sellIn, int quality) {
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

    void decreaseQuality() {
        quality -= 1;
    }

    void increaseQuality() {
        quality += 1;
    }

    void resetQuality() {
        quality = 0;
    }

    void decreaseSellIn() {
        this.sellIn -= 1;
    }

    public int getSellIn() {
        return sellIn;
    }

    @Deprecated()
    void setSellIn(int sellIn) {
        decreaseSellIn();
    }
}
