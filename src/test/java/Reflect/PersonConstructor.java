package Reflect;

public class PersonConstructor {
    private String name;
    private int age;
    public PersonConstructor(String name,int age){
        this.name=name;
        this.age=age;
    }
    private PersonConstructor(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "PersonConstructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
