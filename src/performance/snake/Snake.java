package performance.snake;

import java.util.List;
import java.util.Objects;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 16.12.19
 * Time: 13:29
 * e-mail: slava_rossii@list.ru
 */
public class Snake {

    private List<Position> chains;
    private Direction direction;

    public Snake(List<Position> chains, Direction direction) {
        this.chains = chains;
        this.direction = direction;
    }

    public List<Position> getChains() {
        return chains;
    }

    public void setChains(List<Position> chains) {
        this.chains = chains;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snake snake = (Snake) o;
        return Objects.equals(chains, snake.chains) &&
                direction == snake.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chains, direction);
    }
}
