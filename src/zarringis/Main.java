package zarringis;

import java.io.Console;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        SetConsoleScreenBufferSize(30, 85);

        //отрисовка рамки
        HorizontalLine upLine = new HorizontalLine(5, 3, 80, '+');
        HorizontalLine downLine = new HorizontalLine(28, 3, 80, '+');
        VerticalLine leftLine = new VerticalLine(5, 28, 3, '+');
        VerticalLine rightLine = new VerticalLine(5, 28, 80, '+');
        upLine.draw();
        downLine.draw();
        leftLine.draw();
        rightLine.draw();

        Point p = new Point(9, 5, '*');
        Snake snake = new Snake(p, 4, Direction.RIGHT);
        snake.draw();
    }

    private static void SetConsoleScreenBufferSize(int i, int i1) {
    }


}
