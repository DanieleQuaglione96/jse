package m10.s05.pizzeria;

import java.util.logging.Logger;

public class Main {
    private static final Logger LOG = Logger.getGlobal();

    public static void main(String[] args) {
        for (PizzaType type : PizzaType.values()) {
            try {
                Pizza pizza = Pizza.create(type);
                System.out.println("Here is your pizza: " + pizza);
            } catch (IllegalArgumentException iae) {
                LOG.severe("Can't create pizza: " + iae.getMessage());
            }
        }
    }
}