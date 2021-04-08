public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        // Съесть указанную пиццу
        /*
        Pizza americana = factory.getPizza(PizzaTypes.AMERICANA);
        Pizza crudo = factory.getPizza(PizzaTypes.CRUDO);
        Pizza margherita = factory.getPizza(PizzaTypes.MARGHERITA);

        americana.eat();
        americana.price();
        crudo.eat();
        crudo.price();
        margherita.eat();
        margherita.price();

        factory.printCount();
        factory.printTotalPrice();
        */

        // Съесть рандомную пиццу

        for(int i = 0; i < 5; i++) {
            factory.eatRandomPizza(factory);
        }
        factory.printCount();
        factory.printTotalPrice();
    }
}