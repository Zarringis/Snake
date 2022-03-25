package zarringis;

import java.util.ArrayList;

public class HorizontalLine extends Figure {

    public HorizontalLine(int x, int yLeft, int yRight, char sym) {
        pList = new ArrayList<Point>();
        for (int y = yLeft; y <= yRight; y++){
            Point p = new Point(x, y, sym);
            pList.add(p);
        }

    }



}

