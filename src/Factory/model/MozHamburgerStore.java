package Factory.model;

import Factory.interfaces.HamburgerStore;

public class MozHamburgerStore extends HamburgerStore {

    @Override
    public Hamburger createHamburger(String type) {
        if (type.equals("cheese")) {
            return new MozambicanCheeseBurger();
        } else if (type.equals("veggie")) {
            return new MozambicanVeggieBurger();
        } else {
            return null;
        }
    }
}
