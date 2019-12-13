package performance.oop;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 13:24
 * e-mail: slava_rossii@list.ru
 */

/*
public - везде
protected - в пакете и наследниках
default - в пакете
private - в классе
 */
abstract class Animal {

    private String name;
    private int age;
    private int height;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void run() {
        System.out.println(this.name + " бежит.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
