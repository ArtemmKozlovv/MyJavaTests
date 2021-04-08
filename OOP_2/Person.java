public class Person {
    String fullName;
    int age;

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    void move(){
        System.out.printf("%s говорит !\n", fullName);
    }
    void talk(){
        System.out.printf("%s говорит !\n", fullName);
    }

    public Person(){
        fullName = "";
        age = 0;
    }
    Person(String fullName, int age){
        this.age = age;
        this.fullName = fullName;
    }
}
