package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;

public class Character implements Component {

    private Bag bag;

    @Override
    public int getPrice() {
        return bag.getPrice();
    }

}
