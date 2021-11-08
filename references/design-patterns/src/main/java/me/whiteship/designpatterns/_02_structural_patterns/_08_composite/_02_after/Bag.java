package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
