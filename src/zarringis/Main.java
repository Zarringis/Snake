package zarringis;

import java.io.Console;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        SetConsoleScreenBufferSize(30, 85);

        //отрисовка рамки
        HorizontalLine upLine = new HorizontalLine(8, 3, 80, '=');
        HorizontalLine downLine = new HorizontalLine(28, 3, 80, '=');
        VerticalLine leftLine = new VerticalLine(8, 28, 3, '+');
        VerticalLine rightLine = new VerticalLine(8, 28, 80, '+');
        upLine.draw();
        downLine.draw();
        leftLine.draw();
        rightLine.draw();

        Point p1 = new Point(9, 9, '*');
        p1.draw();

        Point p2 = new Point(4, 15, '#');
        p2.draw();

        //HorizontalLine line = new HorizontalLine(8, 5, 10, '+');

       // VerticalLine line1 = new VerticalLine(8, 13, 5, '+');


    }

    private static void SetConsoleScreenBufferSize(int i, int i1) {
    }


}
