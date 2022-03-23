package zarringis;

import java.util.ArrayList;

public class Figure {

   protected ArrayList<Point> plist; //pList была видна у наследников
    public void draw() {
        for (Point p : plist) {
            p.draw();
        }
    }
}
