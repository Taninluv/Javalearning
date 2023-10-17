package Reflect;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;

    public void study(String s) {
        System.out.println("学习中..." + s);
    }

    private String sleep(int age) {
        System.out.println("睡眠中..." + age);
        return "sleep";
    }

    private class Class {
        private String cname;
    }

    public Person() {

    }

    // 构造函数
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void reflect() {
        System.out.println("弹弹弹，射射射");
    }

    private void reflect2() {
        System.out.println("弹弹弹，射射射2");
    }
    public static void reflect3() {
        System.out.println("弹弹弹，射射射3");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
