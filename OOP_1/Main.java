public class Main {

    public static void main(String[] args) {

        Phone iphone = new Phone(295978093,"Iphone 11",892);   // объект 1
        iphone.displayInfo();
        iphone.receiveCall("Пожарная служба", 101);
        iphone.sendMessage(101,102,103,104);

        Phone samsung = new Phone(336478232,"Samsung A51");    // объект 2
        samsung.setWeight(929);
        samsung.displayInfo();
        samsung.receiveCall("Полиция");
        samsung.getNumber(102);

        Phone meizu = new Phone();      // объект 3
        meizu.setNumber(257429532);
        meizu.setModel("Meizu S2 Note");
        meizu.setWeight(754);
        meizu.displayInfo();
        meizu.receiveCall("Скорая помощь");
        meizu.getNumber(103);
    }
}
