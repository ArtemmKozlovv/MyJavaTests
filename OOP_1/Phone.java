public class Phone {
    private long number;    // Номер телефона
    private String model;   // Модель телефона
    private int weight;     // Вес телефона
    // методы класса
    void displayInfo(){
        System.out.printf("Number: %d \tModel: %s \tWeight: %d\n", number, model, weight);
    }
    void receiveCall(String name){
        System.out.printf("Звонит %s\n", name);
    }
    void receiveCall(String name, int num){
        System.out.printf("Звонит: %s\nНомер : %d\n", name, num);
    }
    void getNumber(int num){
        System.out.printf("Номер: %d\n", num);
    }
    void sendMessage(int...otherNum){
        System.out.println("Номера которым будет отправленно сообщение : ");
        for (int i = 0; i < otherNum.length; i++){
            System.out.println(otherNum[i]);
        }
    }
    //set&get
    public long getNumber(){
        return number;
    }
    public void setNumber(long number){
        this.number = number;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    // конструкторы класса
    Phone(long number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(long number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }
    public Phone(){
        number = 0;
        model = "";
        weight = 0;
    }
}