public class Main {

    public static void main(String[] args){

        Person Artem = new Person();
        Artem.setAge(20);
        Artem.setFullName("Kozlov Artem");
        Artem.talk();

        Person Denis = new Person("Kostilev Denis", 20);
        Denis.move();
    }

}
