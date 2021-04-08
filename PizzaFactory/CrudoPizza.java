// Пицца «Крудо»
public class CrudoPizza implements Pizza{
    @Override
    public void eat() {
        System.out.println("You are eating Crudo Pizza!");
    }
    // Стоимость
    public void price() {
        System.out.printf("Cost of Crudo Pizza = %.2f$\n\n", 3.32);
    }
    public static double getPrice() {
        return 3.32;
    }
}
