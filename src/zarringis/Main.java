package zarringis;

import java.io.Console;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(2, 3, '*');
        p1.draw();

        Point p2 = new Point(4, 5, '#');
        p2.draw();

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(0);
        numList.add(1);
        numList.add(2);

        for (int i: numList)
        {
            System.out.println(i);
        }

        ArrayList<Point> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);
        System.out.println("Завершение цикла finish");

    }


}
