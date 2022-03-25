package zarringis;

import java.util.ArrayList;

public class VerticalLine extends Figure{

    public VerticalLine(int xUp, int xDown, int y, char sym) {
        pList = new ArrayList<Point>();
        for (int x = xUp; x <= xDown; x++){
            Point p = new Point(x, y, sym);
            pList.add(p);
        }

    }


}

