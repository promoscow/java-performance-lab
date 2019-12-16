package performance.snake;

import java.awt.event.KeyEvent;
import java.util.*;

/**
 * Author: Vyacheslav Chernyshov
 * Date: 16.12.19
 * Time: 13:37
 * e-mail: slava_rossii@list.ru
 */
public class App extends Thread {

    private Snake snake;
    private Fruit fruit;
    private int[][] matrix;
    private int height;
    private int width;
    private String[] symbols = {".", "*", "@"};
    private Map<Direction, Position> directions = new HashMap<>();
    private boolean eaten;

    {
        eaten = false;
        height = 20;
        width = 20;
        snake = new Snake(createChains(), Direction.RIGHT);
        fruit = new Fruit(new Position(10, 15));
        matrix = new int[height][width];

        directions.put(Direction.RIGHT, new Position(0, 1));
        directions.put(Direction.LEFT, new Position(0, -1));
        directions.put(Direction.UP, new Position(-1, 0));
        directions.put(Direction.DOWN, new Position(1, 0));
    }

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    @Override
    public void run() {

        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        while (true) {
            try {
                render();
                move();
                checkIfEaten();
                listenKeyboard(keyboardObserver);
                sleep();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("GAME OVER!");
                System.exit(0);
            }
        }
    }

    private void listenKeyboard(KeyboardObserver keyboardObserver) {
        if (keyboardObserver.hasKeyEvents()) {
            KeyEvent keyEvent = keyboardObserver.getEventFromTop();
            if (keyEvent.getKeyChar() == 'q') {
                System.out.println("QUIT!");
                System.exit(0);
            }
            changeDirection(keyEvent);
        }
    }

    private void changeDirection(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (!snake.getDirection().equals(Direction.DOWN)) snake.setDirection(Direction.UP);
                break;
            case KeyEvent.VK_DOWN:
                if (!snake.getDirection().equals(Direction.UP)) snake.setDirection(Direction.DOWN);
                break;
            case KeyEvent.VK_RIGHT:
                if (!snake.getDirection().equals(Direction.LEFT)) snake.setDirection(Direction.RIGHT);
                break;
            case KeyEvent.VK_LEFT:
                if (!snake.getDirection().equals(Direction.RIGHT)) snake.setDirection(Direction.LEFT);
                break;
        }
    }

    private void checkIfEaten() {
        Position head = snake.getChains().get(0);
        Position fruitPosition = fruit.getPosition();
        if (head.equals(fruitPosition)) {
            eaten = true;
            fruit.setPosition(generateNewPosition());
        }
    }

    private Position generateNewPosition() {
        List<Position> emptyPositions = getEmptyPositions();
        return emptyPositions.get(new Random().nextInt(emptyPositions.size() - 1));
    }

    private List<Position> getEmptyPositions() {
        List<Position> emptyPositions = new ArrayList<>();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Position position = new Position(y, x);
                if (!snake.getChains().contains(position)) {
                    emptyPositions.add(position);
                }
            }
        }
        return emptyPositions;
    }

    private void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void move() {
        List<Position> chains = snake.getChains();
        moveBody(chains);
        moveHead(chains);
    }

    private void moveHead(List<Position> chains) {
        Position head = chains.get(0);
        Direction direction = snake.getDirection();
        head.setY(head.getY() + directions.get(direction).getY());
        head.setX(head.getX() + directions.get(direction).getX());
    }

    private void moveBody(List<Position> chains) {
        for (int i = chains.size() - 1; i > 0; i--) {
            Position position = chains.get(i);
            Position previousPosition = chains.get(i - 1);
            position.setY(previousPosition.getY());
            position.setX(previousPosition.getX());
        }
    }

    private void render() {
        renderMatrix();
        renderSnake();
        renderFruit();
        print();
    }

    private void print() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(symbols[matrix[y][x]] + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    private void renderFruit() {
        Position position = fruit.getPosition();
        matrix[position.getY()][position.getX()] = 2;
    }

    private void renderSnake() {
        if (eaten) {
            snake.getChains().add(new Position());
            eaten = false;
        }
        for (int i = 0; i < snake.getChains().size(); i++) {
            Position position = snake.getChains().get(i);
            matrix[position.getY()][position.getX()] = 1;
        }
    }

    private void renderMatrix() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                matrix[y][x] = 0;
            }
        }
    }

    private List<Position> createChains() {
        List<Position> list = new ArrayList<>();
        list.add(new Position(10, 10));
        list.add(new Position(10, 9));
        list.add(new Position(10, 8));
        list.add(new Position(10, 7));
        list.add(new Position(10, 6));
        return list;
    }
}
