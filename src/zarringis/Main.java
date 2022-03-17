package zarringis;

import java.io.Console;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args)
    {
        Point p1 = new Point(2, 3, '*');
        p1.draw();

        Point p2 = new Point(4, 5, '#');
        p2.draw();

        HorizontalLine line = new HorizontalLine();
        line.draw();

    }


}
