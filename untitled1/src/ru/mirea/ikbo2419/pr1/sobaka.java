package ru.mirea.ikbo2419.pr1;
import java.lang.*;
public
class sobaka {
    private String name;
    private int age;
    public sobaka(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge() {
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }
}
