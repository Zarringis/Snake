package zarringis;

import java.util.ArrayList;

public class Snake extends Figure {
    Direction direction; // создание переменной, для того чтобы можнобыло воспользоваться ею в классе Snake

    public Snake(Point tail, int length, Direction _direction) {

        direction = _direction;
        pList = new ArrayList<Point>();

        for (int i = 0; i < length; i++) {
            Point p = new Point(tail); //создание точки, явл. точной копии хвостоваой точки(цикл)
            p.move(i, direction);
            pList.add(p);
        }


    }

    void move() {
        Point tail = pList.get(0);
        pList.remove(tail);
        Point head = getNextPoint();
        pList.add(head);

        tail.clear();
        head.draw();
    }

    public Point getNextPoint() {
        Point head = pList.get(pList.size() - 1);
        Point nextPoint = new Point(head);
        nextPoint.move(1, direction);
        return nextPoint;
    }
}
