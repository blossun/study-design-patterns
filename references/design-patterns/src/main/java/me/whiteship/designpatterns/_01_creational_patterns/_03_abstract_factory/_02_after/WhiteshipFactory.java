package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.DefaultShipFactory;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.Whiteship;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteAnchor;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteWheel;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
