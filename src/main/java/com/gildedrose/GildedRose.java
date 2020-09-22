package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Aged Brie")
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.getQuality() > 0 && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.decreaseQuality();
                }
            } else if (item.getQuality() < 50) {
                item.increaseQuality();
                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.sellIn < 11 && item.getQuality() < 50) {
                        item.increaseQuality();
                    }
                    if (item.sellIn < 6 && item.getQuality() < 50) {
                        item.increaseQuality();
                    }
                }
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getQuality() > 0 && !item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                item.decreaseQuality();
                        }
                    } else {
                        item.resetQuality();
                    }
                } else {
                    if (item.getQuality() < 50) {
                        item.increaseQuality();
                    }
                }
            }
        }
    }
}
