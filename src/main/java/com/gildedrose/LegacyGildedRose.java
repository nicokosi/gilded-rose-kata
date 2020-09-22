package com.gildedrose;

class LegacyGildedRose {
    Item[] items;

    public LegacyGildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Aged Brie")
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.getQuality() > 0) {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.decreaseQuality();
                    }
                }
            } else {
                if (item.getQuality() < 50) {
                    item.increaseQuality();

                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getSellIn() < 11) {
                            if (item.getQuality() < 50) {
                                item.increaseQuality();
                            }
                        }

                        if (item.getSellIn() < 6) {
                            if (item.getQuality() < 50) {
                                item.increaseQuality();
                            }
                        }
                    }
                }
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.setSellIn(item.getSellIn() - 1);
            }

            if (item.getSellIn() < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.getQuality() > 0) {
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                item.decreaseQuality();
                            }
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
