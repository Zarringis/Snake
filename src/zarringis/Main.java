package zarringis;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 2;
        p1.y= 3;
        p1.sym = '*';


        p1.Draw();

        Point p2 = new Point();
        p2.x = 4;
        p2.y= 5;
        p2.sym = '#';

        p2.Draw();

    }



}
