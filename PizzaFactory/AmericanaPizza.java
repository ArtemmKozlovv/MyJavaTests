// Пицца «Американо»
public class AmericanaPizza implements Pizza{
    @Override
    public void eat() {
        System.out.println("You are eating Americano's Pizza!");
    }

    public void price() {
        System.out.printf("Cost of Americano Pizza = %.2f$\n\n", 2.00000);
    }
    public static double getPrice() {
        return 2.000000000000;
    }
}
