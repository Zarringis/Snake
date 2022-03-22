package zarringis;

import java.util.ArrayList;

public class VerticalLine {
    ArrayList<Point> plist;

    public VerticalLine(int xTop, int xBottom, int y, char sym) {
        plist = new ArrayList<Point>();
        for (int x = xTop; x <= xBottom; x++){
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

