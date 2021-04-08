import java.util.Random;

public class PizzaFactory {
    // Переменные для подсчета кол-ва пицц в заказе
    private int margheritaPizzaCount = 0;
    private int americanaPizzaCount = 0;
    private int crudoPizzaCount = 0;
    private float totalPrice = 0;
    public Pizza getPizza(PizzaTypes type){
        Pizza toReturn = null;
        switch (type){
            case AMERICANA:
                americanaPizzaCount++;
                totalPrice += AmericanaPizza.getPrice();
                toReturn = new AmericanaPizza();
                break;
            case CRUDO:
                crudoPizzaCount++;
                totalPrice += CrudoPizza.getPrice();
                toReturn = new CrudoPizza();
                break;
            case MARGHERITA:
                margheritaPizzaCount++;
                totalPrice += MargheritaPizza.getPrice();
                toReturn = new MargheritaPizza();
                break;
            default:
                throw new IllegalArgumentException("Wrong Pizza type : " + type);
        }
        return toReturn;
    }
    // Вывод кол-ва пицц каждого вида в заказе
    public void printCount() {
        System.out.println("Number of pizza produced (by type):");
        System.out.println("Americana pizza: " + americanaPizzaCount);
        System.out.println("Crudo pizza: " + crudoPizzaCount);
        System.out.println("Margherita pizza: " + margheritaPizzaCount);
        System.out.println("Total: " + (americanaPizzaCount + crudoPizzaCount + margheritaPizzaCount));
    }
    // Вывод общей стоимости заказа
    public void printTotalPrice(){
        System.out.printf("Total price : %.2f$", totalPrice);
    }
    // Random Pizza
    public  static void eatRandomPizza(PizzaFactory factory){
        Pizza randomPizza = getRandomPizza(factory);
        System.out.printf("What a Surprise! ");
        randomPizza.eat();
        randomPizza.price();
    }
    public static Pizza getRandomPizza(PizzaFactory factory){
        Random random = new Random();
        PizzaTypes type = PizzaTypes.values()[random.nextInt(PizzaTypes.values().length)];

        return(factory.getPizza(type));
    }
}
