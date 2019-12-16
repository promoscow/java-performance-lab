package performance.snake;

import java.util.Objects;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 16.12.19
 * Time: 13:36
 * e-mail: slava_rossii@list.ru
 */
public class Fruit {

    private Position position;

    public Fruit(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(position, fruit.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
