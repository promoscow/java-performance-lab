package performance.snake;

import java.util.Objects;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 16.12.19
 * Time: 13:30
 * e-mail: slava_rossii@list.ru
 */
public class Position {

    private int y;
    private int x;

    public Position() {
    }

    public Position(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return y == position.y &&
                x == position.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }
}
