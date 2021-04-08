// Пицца «Маргарита»
public class MargheritaPizza implements Pizza {
    @Override
    public void eat() {
        System.out.println("You are eating Margherita Pizza!");
    }
    public void price() {
        System.out.printf("Cost of Margherita Pizza = %.2f$\n\n", 5.0000000);
    }
    public static double getPrice() {
        return 5.00000;
    }
}
