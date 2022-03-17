package zarringis;

import java.util.ArrayList;

public class HorizontalLine {
    ArrayList<Point> plist;

    public HorizontalLine() {
        plist = new ArrayList<Point>();
        Point p1 = new Point(5, 4, '*');
        Point p2 = new Point(5, 5, '*');
        Point p3 = new Point(5, 6, '*');
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
    }

    public void draw() {
        for (Point p : plist) {
            p.draw();
        }
    }


}

