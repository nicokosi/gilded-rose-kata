package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.setQuality(quality);
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.getQuality();
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
