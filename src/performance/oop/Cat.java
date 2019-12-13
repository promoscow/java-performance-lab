package performance.oop;

import performance.oop.Animal;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 13:26
 * e-mail: slava_rossii@list.ru
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " делает лапками.");
    }
}
