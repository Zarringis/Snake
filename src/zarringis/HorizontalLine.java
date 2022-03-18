package zarringis;

import java.util.ArrayList;

public class HorizontalLine {
    ArrayList<Point> plist;

    public HorizontalLine(int x, int yLeft, int yRight, char sym) {
        plist = new ArrayList<Point>();
        for (int y = yLeft; y <= yRight; y++){
            Point p = new Point(x, y, sym);
            plist.add(p);
        }

    }

    public void draw() {
        for (Point p : plist) {
            p.draw();
        }
    }


}

