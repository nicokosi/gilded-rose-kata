package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.getQuality();
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
}
