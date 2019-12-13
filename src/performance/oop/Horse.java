package performance.oop;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 13.12.19
 * Time: 14:23
 * e-mail: slava_rossii@list.ru
 */
public class Horse extends Animal {

    private String master;

    public Horse() {
    }

    public Horse(String name) {
        super(name);
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " скачет.");
    }


}
