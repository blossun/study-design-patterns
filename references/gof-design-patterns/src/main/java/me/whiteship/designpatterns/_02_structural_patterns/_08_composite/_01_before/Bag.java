package me.whiteship.designpatterns._02_structural_patterns._08_composite._01_before;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
