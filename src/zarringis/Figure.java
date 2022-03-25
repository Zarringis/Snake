package zarringis;

import java.util.ArrayList;

public class Figure {

   protected ArrayList<Point> pList; //pList была видна у наследников
    public void draw() {
        for (Point p : pList) {
            p.draw();
        }
    }
}
